package hw2;

public class Rabbit {
    public static void main(String[] args) {
        int r = 1;
        while (!(r % 3 == 1 && r % 5 == 3 && r % 7 == 2)){
            r++;
        }
        System.out.println(r);
    }
}
