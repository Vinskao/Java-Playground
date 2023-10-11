package hw1;

public class LeapYear {
    public static void main(String[] args) {
        int y= 2304;
        boolean isLeap = false;

        if (y % 400 == 0){
            isLeap = true;
        } else if (y % 100 == 0){
            isLeap = false;
        } else if (y % 4 == 0){
            isLeap = true;
        }
        System.out.println(isLeap);
    }
}
