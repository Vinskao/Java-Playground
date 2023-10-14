package hw3;
public class Sales {
    public static int[] sumByProduct(int[][] s){
        int[] productSum = new int[s[0].length];

        for (int i = 0; i < s[0].length; i++){
            int sum = 0;
            for (int j = 0; j < s.length; j++){
                sum += s[j][i];
            }
            productSum[i] = sum;
        }
        return productSum;
    }

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
        String[] productNames = {"A", "B", "C", "D", "E"};
        //每一個銷售員的銷售總金額
        int[] personalSum = sum(salesData);

        for (int i = 0; i < salesData.length; i++) {
            System.out.println(names[i]+" "+personalSum[i]);
        }
        //有最好業績（銷售總金額最多者）的銷售員
        int highestSale = highestSale(personalSum);

        for (int i = 0; i < salesData.length; i++) {
            if (personalSum[i] == highestSale){
                System.out.println("最高業績: "  + names[i]);
            }
        }
        //每一項產品的銷售總金額
        int[] productSum = sumByProduct(salesData);

        for (int i = 0; i < productSum.length; i++) {
            System.out.println(productNames[i] + " " + productSum[i]);
        }
        //銷售總金額最多的產品

    }
}