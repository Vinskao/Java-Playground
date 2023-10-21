package hw5.Stack;

public class test {
    public static void main(String[] args) {
        testPushAndPop();
    }
    public static void testPushAndPop() {
        Stack stack = new Stack(1);
        try {
            stack.push(3); // 添加元素
            stack.pop(); // 弹出元素
            stack.push(3); // 添加元素
            stack.push(3); // 添加元素
            System.out.println("Successful pop and push");
        } catch (StackEmptyException e) {
            System.out.println("Caught StackEmptyException: " + e.getMessage());
        } catch (StackFullException e) {
            System.out.println("Caught StackFullException: " + e.getMessage());
        } finally {
            System.out.println("Finally pop and push");
        }
        System.out.println("Pop and push dealt with");
    }
}
