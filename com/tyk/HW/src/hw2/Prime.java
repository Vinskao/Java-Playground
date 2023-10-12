package hw2;

public class Prime {
    public static void main(String[] args) {
        int x = 1398;
        int[] f = new int[x]; //factors
        int count = 0;
        int[] p = new int[x]; //primes
        int countp = 0;


        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                f[count] = i;
                count++;

                int divisorCount = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisorCount++;
                    }
                }

                if (divisorCount ==2){
                    p[countp] = i;
                    countp++;
                }
            }
        }
        //test
        for (int i = 0; i < countp; i++) {
            if (p[i] != 0) {
                System.out.print(p[i] + " ");
            }
        }
    }

}
