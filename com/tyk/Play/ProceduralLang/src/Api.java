public class Api {
    public static void main(String[] args) {
        String str = "ni shi say hello world ni hao hello";
        int idx = indexOf(str, "hello", -1); // Start searching from the beginning
        while (idx >= 0) {
            System.out.println("Index of 'hello': " + idx);
            idx = indexOf(str, "hello", idx); // Continue searching from the last index found
        }
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());

        String[] tokens = str.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }

    public static int indexOf(String str, String subStr, int idx) {
        return str.indexOf(subStr, idx + 1);
    }


}
