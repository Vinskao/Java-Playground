package hw3;
public class Sales {

        public static int[] sum(int[][] s){

            int[] sales = new int[s.length];

            for (int i = 0; i < s.length ; i++){
                int sum = 0;
                for (int j = 0; j < s[i].length ; j++){
                    sum += s[i][j];
                }
                sales[i] = sum;
            }
            return sales;
        }
    public static void main(String[] args) {
        int[][] salesData = {
                {33, 32, 56, 45, 33},
                {77, 33, 68, 45, 23},
                {43, 55, 43, 67, 65}
        };

        String[] names = {"Joanne","Tom","Tina"};

        int[] personalSum = sum(salesData);

        for (int i = 0; i < salesData.length; i++) {
            System.out.println(names[i]+" "+personalSum[i]);
        }
    }
}