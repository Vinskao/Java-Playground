package hw2;
import java.util.Arrays;

public class Factor {
    public static void main(String[] args) {
        int x = 1024;
        int[] f = new int[x]; //factors
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                f[count] = i;
                count++;
            }
        }
        //test
        for (int i = 0; i < count; i++) {
            if (f[i] != 0) {
                System.out.print(f[i] + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
