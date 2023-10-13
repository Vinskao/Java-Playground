public class Dimension {
    public static void main(String[] args) {
        int sum = 0;
        int [][][] arr =
                {
                        {
                                {
                                        1,2,3,3
                                },
                                {
                                        3,4,5,5
                                }
                        },
                        {
                                {
                                        1,2,3,4
                                },
                                {
                                        3,4,5,5
                                }
                        }
                };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum += arr[i][j][k];
                    count++;
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
    }
}
