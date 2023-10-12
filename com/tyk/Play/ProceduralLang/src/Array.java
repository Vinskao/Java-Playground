public class Array {
    public static void main(String[] args) {
        int sum = 0;
        int[] score = new int[10];
        score[0] = 10;
        score[1] = 11;


        for (int i = 0; i < score.length ; i++) {
            sum += score[i];
        }
        int avg = sum / score.length;
    }
}