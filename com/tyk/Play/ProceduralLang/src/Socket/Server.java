package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("Server started");
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream output = new PrintStream(socket.getOutputStream(), true);

            String line = input.readLine();
            while (line != null){
                System.out.println(line);
                output.println(socket + line);
                line = input.readLine();
            }

            input.close();
            output.close();
            socket.close();
        }
    }
}
