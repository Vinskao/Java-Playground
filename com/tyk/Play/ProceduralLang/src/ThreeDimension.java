public class TwoDimension {
    public static void main(String[] args) {
        int sum = 0;
        int [][] arr = {{1,2,3},{3,4,5,5},{6,9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum: " + sum);

        sum  = 0;
        arr = new int[][]{{2,4,4}, {2,4,4}, {2,4,4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum: " + sum);
    }
}
