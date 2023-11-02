package Socket;
import java.io.*;
import java.net.Socket;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost" , 9999);
        PrintStream output = new PrintStream(socket.getOutputStream() , true);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        Console console = System.console();
        String keyInput = console.readLine();
        while (keyInput != null){
            output.println(keyInput);
            String line = input.readLine();
            System.out.println(line);
            keyInput = console.readLine();
        }
        input.close();
        output.close();
        socket.close();
    }
}
