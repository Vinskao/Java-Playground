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

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入：");
        String input = scanner.next();

        if (input.equals("all")){
        } else if (input.equals("year")){

        } else if (input.equals("season")){

        } else if (input.equals("month")){

        } else {
            System.out.println("error");
        }
    }
}
