public class Factor {
    static int factorial(int num){
        int result = 1;
        for(int i = num; i >= 1 ; i--) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("4!= " + factorial(4));
    }
}
