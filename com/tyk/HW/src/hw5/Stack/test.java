package hw5.Stack;

public class test {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        try{
            stack.push(5);
            stack.push(4);
        } catch (StackFullException e) {
            System.out.println("caught full");
        }
    }
    public static void push() throws StackFullException{
        try{
            System.out.println("in push() method");
            throw new StackFullException("full in pull() method");
        } catch (StackFullException e){
            System.out.println("full and caught in method");
        }
    }
}
