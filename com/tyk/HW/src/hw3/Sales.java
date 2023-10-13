package hw3;
public class Sales {
        public static int[] sum(int[] sales){
            int[][] s =
                    {
                            {33, 32, 56, 45, 33},
                            {77, 33, 68, 45, 23},
                            {43, 55, 43, 67, 65}
                    };

            for (int i = 0; i < s.length ; i++){
                int sum = 0;

                for (int j = 0; j < s[i].length ; j++){
                    sum += s[i][j];
                }
                sales[i] = sum;
            }

            for (int i = 0; i < s.length ; i++){
                if (sales[i] > sales [i]){

                }
            }
            return sales;
        }
    public static void main(String[] args) {
        int[] personalSum = new int[3];
        sum(personalSum);
        System.out.println(personalSum[0]);
        System.out.println(personalSum[1]);
        System.out.println(personalSum[2]);
    }
}