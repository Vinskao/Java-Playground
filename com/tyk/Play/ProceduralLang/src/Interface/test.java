package Interface;

public class test {
    public static void main(String[] args) {
        Son son = new Son() {
            @Override
            public void method1() {
                System.out.println("Implementing method1");
            }

            @Override
            public int method2(String msg) {
                System.out.println("Implementing method2");
                return 42;
            }
        };

        son.method1();
        int result = son.method2("Hello, World!");

        System.out.println("Result: " + result);

        ImplementSubclass implement = new ImplementSubclass();
        implement.method1();
    }
}
