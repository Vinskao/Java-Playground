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
    public static int highestSale(int[] sale){
        int highestSale = 0;

        for(int temp : sale){ // temp 是循环变量，它会依次代表数组 sale 中的每个元素
            if(temp > highestSale){
                highestSale = temp;
            }
        }
        return highestSale;
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

        int highestSale = highestSale(personalSum);

        for (int i = 0; i < salesData.length; i++) {
            if (personalSum[i] == highestSale){
                System.out.println("最高業績: "  + names[i]);
            }
        }
    }
}