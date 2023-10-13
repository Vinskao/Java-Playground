public class EqualString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("hello");
        boolean equalTo = false;
        if (s1.equals(s2)) {
            equalTo = true;
        }
        s1.compareTo(s2);

        System.out.println(equalTo);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}
