import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements to the ArrayList
        list.add(12);
        // Iterate through the ArrayList and print elements
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
