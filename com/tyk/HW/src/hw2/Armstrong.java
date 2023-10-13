// 用数学符号表示，对于一个 n 位数 N：
// N = d1^3 + d2^3 + d3^3 + ... + dn^3
// 其中 d1, d2, d3, ... , dn 是 N 的各个位数。
package hw2;

public class Armstrong {
    public static void main(String[] args) {
        int lowerLimit = 100;
        int upperLimit = 999;

        for (int n = lowerLimit; n <= upperLimit; n++) {
            if (isArmStrongNumber(n)) {
                System.out.println(n);
            }
        }
    }
    public static boolean isArmStrongNumber(int n) {
        int number = n;
        int sum = 0;
        int digit1 = number % 10; //個位數
        int digit2 = (number / 10) % 10; //十位數
        int digit3 = number / 100; //百位數
        double sum1 = Math.pow(digit1, 3);
        double sum2 = Math.pow(digit2, 3);
        double sum3 = Math.pow(digit3, 3);
        sum = (int)(sum1 + sum2 + sum3);

        return sum == number;
    }
}
