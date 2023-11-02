package SocketThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class Xxx implements Runnable {
	private Socket socket;	
	public Xxx(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try(
			BufferedReader input = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintStream output = new PrintStream(socket.getOutputStream(), true);) {
			
			String line = input.readLine();			//2
			while(line!=null) {
				System.out.println(socket+"\t"+line);
				output.println(socket+"\t"+line);	//3

				line = input.readLine();			//2
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}
	}
}

public class Server {
	public static void main(String[] args) throws Exception {
		System.out.println("Server Started");
		ServerSocket serverSocket = new ServerSocket(10000);
		
		while(true) {
			Socket socket = serverSocket.accept();
			
			Runnable runnable = new Xxx(socket);
			Thread thread = new Thread(runnable);
			thread.start();
		}

	}
}
