package Interface;

public class ImplementSubclass extends Implement {
    @Override
    public void method1() {
        System.out.println("working");
    }

    @Override
    public int method2(String msg) {
        // 实现method2的具体逻辑
        return 0; // 返回一个合适的值
    }
}
