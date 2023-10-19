package exception;

public class test {
    public static void main(String[] args) {
        String[] greeting = {"hello", "hi" , "good"};
        try {
            for (int i = 0; i <= greeting.length; i++) {
                System.out.println(greeting[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bound");
        } catch (Exception e){
            System.out.println("out");
        }
        System.out.println("end");
    }
}
