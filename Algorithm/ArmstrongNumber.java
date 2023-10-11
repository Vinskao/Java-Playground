// 用数学符号表示，对于一个 n 位数 N：

// N = d1^3 + d2^3 + d3^3 + ... + dn^3

// 其中 d1, d2, d3, ... , dn 是 N 的各个位数。


public class ArmstrongNumber {
    public static void main(String[] args) {
        int lowerLimit = 1; 
        int upperLimit = 10000; 

        System.out.println("Armstrong numbers in the range " + lowerLimit + " to " + upperLimit + ":");
        
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
    
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, String.valueOf(originalNumber).length()); 
            number /= 10;
        }
    
        return sum == originalNumber;
    }
}
