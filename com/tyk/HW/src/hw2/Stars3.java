package hw2;

public class Stars3 {
    public static void main(String[] args) {
        String star = "*";
        String blank = " ";

        int l = 5;

        for (int i = 0; i < l; i++) {
            String str = "";
            for (int count = l; count > i; count--) {
                str += blank;
            }
            for (int count = 0; count <= i; count++) {
                str += star;
            }
            for (int count = 1; count <= i; count++) {
                str += star;
            }

            System.out.println(str);
        }
    }
}
