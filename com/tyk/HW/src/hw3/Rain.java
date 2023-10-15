package hw3;
import java.util.Scanner;
public class Rain {
    public static void main(String[] args) {
        int[][][] rainData = {
                {
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}
                },
                {
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}
                },
                {
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}
                },
                {
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}
                },
                {
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}
                }
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入all、year、season 或 month：");
        String input = scanner.next();

        if (input.equals("all")) {
            double sumData = 0;
            for (int i = 0; i < rainData.length; i++) {
                for (int j = 0; j < rainData[i].length; j++) {
                    for (int k = 0; k < rainData[i][j].length; k++) {
                        sumData += rainData[i][j][k];
                    }
                }
            }
            System.out.println("月的總平均降雨量：" + sumData / (rainData.length * rainData[0].length * rainData[0][0].length));
        } else if (input.equals("year")) {
            System.out.println("第幾年（請輸入1-5）：");
            int inputYear = scanner.nextInt();
            if (inputYear < 1 || inputYear > 5) {
                System.out.println("錯誤：年份輸入不在1到5的範圍內");
            } else {
                int sumYear = 0;
                for (int i = 0; i < rainData[inputYear - 1].length; i++) {
                    for (int j = 0; j < rainData[inputYear - 1][i].length; j++) {
                        sumYear += rainData[inputYear - 1][i][j];
                    }
                }
                System.out.println("第 " + inputYear + " 年的降雨總量：" + sumYear);
            }
        } else if (input.equals("season")) {
            System.out.println("第幾季（請輸入1-4）：");
            int inputSeason = scanner.nextInt();
            if (inputSeason < 1 || inputSeason > 4){
                System.out.println("錯誤");
            } else {
                double sumSeason = 0;
                for (int i = 0; i <  rainData.length; i++){
                    for (int j = 0; j < rainData[i][inputSeason -1].length; j++){
                        sumSeason += rainData[i][inputSeason -1][j];
                    }
                }
                System.out.println("第 " + inputSeason + " 季的平均降雨總量：" + sumSeason/(rainData.length));
            }
        } else if (input.equals("month")) {
            System.out.println("第幾月（請輸入1-12）：");
            int inputMonth = scanner.nextInt();
            if (inputMonth < 1 || inputMonth > 12){
                System.out.println("error");
            } else if (inputMonth >= 1 || inputMonth <= 4) {
                int season = (inputMonth - 1) / 3;
                double sumMonth = 0;
                for (int i = 0; i < rainData.length; i++){
                    for (int j = 0; j < rainData[season].length; j++) {
                        sumMonth += rainData[i][j][inputMonth - 1];
                    }
                }
                System.out.println(inputMonth + " 月的總降雨總量：" + sumMonth);
            }
        } else {
            System.out.println("error");
        }
    }
}
