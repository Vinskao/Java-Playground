package Abstract;

public class test {
    public static void main(String[] args) {
        Abstract a  = new GetAbstract();
        a.method();
        a.method1();

        GetAbstract b = new GetAbstract();
        b.method();
        b.method1();
    }
}
