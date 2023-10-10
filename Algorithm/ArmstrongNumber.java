public class ArmstrongNumber {
    public static void main(String[] args) {
        int lowerLimit = 1; // 指定范围的下限
        int upperLimit = 10000; // 指定范围的上限

        System.out.println("Armstrong numbers in the range " + lowerLimit + " to " + upperLimit + ":");
        
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
