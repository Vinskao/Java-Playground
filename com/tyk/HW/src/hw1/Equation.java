package hw1;
public class Equation {
    public static void main(String[] args) {
        int a = 1;
        int b = -5;
        int c = -3;
        double x1 = 0;
        double x2 = 0;

        if (b * b - 4 * a * c < 0 ){
            System.out.println("沒有實根");
        } else if (b * b - 4 * a * c == 0){
            x1 = (-b)/ (2 * a);
            System.out.println("x1:" + x1 );
        } else {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c))/ (2 * a);
            System.out.println("x1:" + x1 );
            System.out.println("x2:" + x2 );
        }
    }
}
