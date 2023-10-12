package hw2;

public class Expression {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50 ; i++){
            if (i % 2 == 0) {
                sum -= i * i;
            } else if (i % 2 == 1) {
                sum += i * i;
            }
        }
        System.out.println(sum);
    }
}
