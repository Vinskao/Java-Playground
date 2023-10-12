package hw2;

public class Stars2 {
    public static void main(String[] args) {
        String star = "*";
        String blank = " ";

        int l = 5;

        for (int i = 0; i < l; i++) {
            String str = "";
            for (int count = 0; count < i; count++) {
                str += blank;
                str += blank;
            }
            for (int count = 4; count >= i; count--) {
                str += star;
                str += blank;
            }
            System.out.println(str);
        }
    }
}
