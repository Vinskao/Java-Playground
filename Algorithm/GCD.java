import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("first integer: ");
        int num1 = input.nextInt();

        System.out.print("second integer: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("gcd: " + gcd);

        input.close();
    }

    // 计算最大公因数的方法
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
