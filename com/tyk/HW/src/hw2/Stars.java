package hw2;

public class Stars {
    public static void main(String[] args) {
        String star = "*";
        int l = 5;

        for (int i = 0; i < l; i++) {
            String str = "";
            for (int count = 0; count <= i; count++) {
                str += star;
            }
            System.out.println(str);
        }
    }
}
