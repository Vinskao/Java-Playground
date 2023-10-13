public class ForEach {
    public static void main(String[] args) {
        int[] n  = {1,2,3,4,5,6,7,8,9};
        int[] m  = {1,2,3,4,5,6,7,8,9};
        for ( int number: n ) {
            for ( int number2: m){
                System.out.println(number * number2);
            }
        }
    }
}
