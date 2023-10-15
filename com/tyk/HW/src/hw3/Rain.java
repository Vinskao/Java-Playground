package hw3;
import java.util.Scanner;
public class Rain {
    public static void main(String[] args) {
        int[][][] rainData = {
                {
                    {5, 9, 3, 4},
                    {1, 7, 2, 8},
                    {6, 4, 10, 9},
                    {3, 8, 5, 6}
                },
                {
                    {2, 4, 8, 10},
                    {9, 6, 3, 7},
                    {5, 1, 7, 2},
                    {3, 6, 4, 9}
                },
                {
                    {7, 2, 5, 9},
                    {8, 10, 4, 3},
                    {1, 6, 8, 3},
                    {5, 7, 2, 4}
                },
                {
                    {4, 9, 10, 1},
                    {3, 8, 6, 5},
                    {7, 2, 5, 4},
                    {2, 6, 8, 7}
                },
                {
                    {6, 5, 3, 8},
                    {7, 10, 2, 4},
                    {1, 9, 3, 6},
                    {4, 7, 8, 5}
                }
        };
        String[] year = {"1","2","3","4","5"};
        String[] season = {"1","2","3","4"};
        String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};

//        int[] yearData = new int[rainData.length];
//        for (int i = 0; i < rainData.length; i++) {
//            System.out.println(yearData);
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入：");
        String input = scanner.next();

        if (input.equals("all")){
            int sumData = 0;
            for(int i = 0; i < rainData.length; i++){
                for(int j = 0; j < rainData[i].length; j++){
                    for(int k = 0; k < rainData[i][j].length; k++){
                        sumData += rainData[i][j][k];
                    }
                }
            }
            System.out.println(sumData / rainData.length * rainData[0].length * rainData[0][0].length);
        } else if (input.equals("year")){

        } else if (input.equals("season")){

        } else if (input.equals("month")){

        } else {
            System.out.println("error");
        }
    }
}
