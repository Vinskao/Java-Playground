package HW2;

public class Expression {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50 ; i++){
            if (i % 2 == 0) {
                continue;
            } else {
                sum -= i * i;
            }
            sum += i * i;
        }
        System.out.println(sum);
    }

}
