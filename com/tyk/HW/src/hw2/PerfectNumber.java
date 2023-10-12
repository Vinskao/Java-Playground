package hw2;
public class PerfectNumber {
    public static void main(String[] args) {
        int upperRange = 10000;
        int lowerRange = 1;
        int sum;
        int[] p = new int[upperRange];
        int countp = 0;

        for (int i = lowerRange; i <= upperRange ; i++) {
            sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                p[countp] = i;
                countp++;
            }
        }

        for (int k = 0; k < countp; k++) {
            System.out.print(p[k] + " ");
        }
    }
}
