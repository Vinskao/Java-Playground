package hw4;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Verifier {
    int alphaBet;
    public void randomEngAndNumber(){
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int randomAlphabetAndNumber = r.nextInt(36); // 0-25为字母，26-35为数字，ASCII值是 65 到 90
            char character;
            if (randomAlphabetAndNumber < 26){
                character = (char)(randomAlphabetAndNumber + 65);
            } else {
                character = (char)(randomAlphabetAndNumber - 26 + 48); //字符 '0' 的ASCII值是48
            }
            System.out.print(character);
        }
    }
    public void randomNoRepeat(){
        Random r = new Random();
        List<Integer> getNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            getNumbers.add(i);
        }
        int randomNumber0 = r.nextInt(10);
        getNumbers.remove(randomNumber0);

        int randomNumber1 = getNumbers.get(r.nextInt(getNumbers.size()));
        getNumbers.remove(Integer.valueOf(randomNumber1));

        int randomNumber2 = getNumbers.get(r.nextInt(getNumbers.size()));
        getNumbers.remove(Integer.valueOf(randomNumber2));

        int randomNumber3 = getNumbers.get(r.nextInt(getNumbers.size()));

        System.out.println(randomNumber0+""+randomNumber1+""+randomNumber2+""+randomNumber3);
    }
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(10000);
        String formatNumber = String.format("%04d", randomNumber);
        System.out.println(formatNumber);
        Verifier verifier = new Verifier(); //Verifier class
        verifier.randomNoRepeat();
        verifier.randomEngAndNumber();
    }
}
