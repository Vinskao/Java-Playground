import java.util.*;
import java.lang.*;
public class ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 向 ArrayList 中添加元素
        list.add(12);

        // 遍历 ArrayList 并打印元素
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
