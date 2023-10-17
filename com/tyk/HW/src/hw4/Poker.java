package hw4;
import java.util.Random;

public class Poker {
    private int[] deck;
    public void shufflePoker(){
        Random r = new Random();
        int[] getCards = new int[52];

        for (int i = 0; i < 52; i++){
            getCards[i] = i; //有0-51的值
        }
        for (int i = 51; i > 0 ; i--){
            int randomCard = r.nextInt(i + 1); // 隨機選擇位置 i 到 0 之間的一個位置
            int tempCard = getCards[i]; //暫存i的值
            getCards[i] = getCards[randomCard]; //把i位置的數換到隨機值產生的位置
            getCards[randomCard] = tempCard; //將位置 i 的值保存到隨機位置
        } // getCards會執行i與隨機值的數字調換51次
        for (int i = 0; i < 52; i++){
            System.out.print(getCards[i] + " ");
        }
    }
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.shufflePoker();
    }
}
