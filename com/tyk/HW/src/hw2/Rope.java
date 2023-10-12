package hw2;

public class Rope {
    public static void main(String[] args) {
        int s = 3000;
        int count = 0;
        while (s > 5){
            s /= 2;
            count++;
        }
        System.out.println(count);
    }
}
