package hw2;

public class Interest {
    public static void main(String[] args) {
        int year = 1;
        int p = 100000;
        double ra = 0.1;
        double rb = 0.05;

        while (!(p*(1+ra*year) < p*Math.pow((1+rb),year))){
            year++;
        }
        System.out.println(year);
        System.out.println("a的錢 " + p*(1+ra*year));
        System.out.println("b的錢 " + p*Math.pow((1+rb),year));
    }
}
