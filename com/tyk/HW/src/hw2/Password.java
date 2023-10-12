package hw2;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passWord =  "123";

        int count = 0;
        do {
            System.out.print("请输入密碼: ");
            String inputPassword = scanner.nextLine();
            count++;
            if (inputPassword.equals(passWord)){
                System.out.println("Correct");
                break;
            } else {
                System.out.println("error");
            }
        } while (count < 3);
        if (count >= 3) {
            System.out.println("locked");
        }
        scanner.close();
    }
}
