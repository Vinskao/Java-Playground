public class returnValue {
    public static void main(String[] args) {
        int result = f(3, 4);
        System.out.println("Result: " + result);
        method();
    }
    public static int f(int x, int y) {
        return x * x + y * y;
    }

    static void method(){
        System.out.println("hi");
    }
}