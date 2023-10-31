package hw4.IDGenerator;

public class Test {
    public static void main(String[] args) {
        IDGenerator idg = new IDGenerator("臺中市","母");

        try {
            String generatedID = idg.generator(); // 传入一个 List 对象，如果不需要的话可以传入 null
            System.out.println("Generated ID: " + generatedID);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
