package hw4;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Verifier {
    public void randomNoRepeat(){
        Random r = new Random();
        List<Integer> getNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            getNumbers.add(i);
        }
        int randomNumber0 = r.nextInt(10);
        getNumbers.remove(Integer.valueOf(randomNumber0));
        int randomNumber1 = getNumbers.get(r.nextInt());
    }
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(10000);
        String formatNumber = String.format("%04d", randomNumber);
        System.out.println(formatNumber);

    }
}
