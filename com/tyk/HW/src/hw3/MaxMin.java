package hw3;

public class MaxMin {
    public static void main(String[] args) {
        int[] s = {1,-523523,3,4,24,6,7,8,4433,2124};
        int min = s[0];
        int max = s[0];

        for (int i = 0; i < s.length; i++) {
            if (s[i] < min){
                min = s[i];
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] > max){
                max = s[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
