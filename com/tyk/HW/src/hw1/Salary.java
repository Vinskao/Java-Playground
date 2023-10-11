package hw1;

public class Salary {
    public static void main(String[] args) {
        int h = 100;
        double standardRate = 150.0;
        double otRate = 150.0 * 1.25;
        double ootRate = 150.0 * 1.5;

        if (h <= 60) {
            System.out.println(h * standardRate);
        } else if (h <= 80){
            System.out.println(60 * standardRate + (h - 60) * otRate);
        } else {
            System.out.println(60 * standardRate + (80 - 60) * otRate + (h-80) * ootRate);
        }
    }
}
