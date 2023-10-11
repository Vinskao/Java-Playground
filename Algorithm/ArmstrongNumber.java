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
