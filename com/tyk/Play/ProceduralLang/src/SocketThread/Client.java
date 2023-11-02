package SocketThread;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 10000);
		
		BufferedReader input = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintStream output = new PrintStream(socket.getOutputStream(), true);

		Console console = System.console();
		String keyboardInput = console.readLine();
		while(keyboardInput!=null) {
			output.println(keyboardInput);	//1
			String line = input.readLine();	//4
			System.out.println(line);
			
			keyboardInput = console.readLine();
		}
		
		input.close();
		output.close();
		socket.close();
	}
}
