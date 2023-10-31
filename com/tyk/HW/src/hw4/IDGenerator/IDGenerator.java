package hw4.IDGenerator;
import java.util.List;
import java.util.Random;

public class IDGenerator {
    private String area;
    private String sex;

    public IDGenerator(String area, String sex) {
        this.area = area;
        this.sex = sex;
    }
    public int sexChecker(String sex) throws Exception {
        String sexInput = this.sex;
        if (sexInput.equals("公")){
            return 1;
        } else if (sexInput.equals("母")){
            return 2;
        }
        throw new Exception("Invalid sex: " + sex);
    }
    public char areaChecker(String area) throws Exception {
        String areaInput = this.area;
        if (areaInput.equals("臺北市")){
            return 'A';
        } else if (areaInput.equals("臺中市")){
            return 'B';
        } else if (areaInput.equals("基隆市")){
            return 'C';
        } else if (areaInput.equals("臺南市")){
            return 'D';
        } else if (areaInput.equals("高雄市")){
            return 'E';
        } else if (areaInput.equals("新北市")){
            return 'F';
        } else if (areaInput.equals("宜蘭縣")){
            return 'G';
        } else if (areaInput.equals("桃園市")){
            return 'H';
        } else if (areaInput.equals("新竹縣")){
            return 'J';
        } else if (areaInput.equals("苗栗縣")){
            return 'K';
        } else if (areaInput.equals("臺中縣")){
            return 'L';
        } else if (areaInput.equals("南投縣")){
            return 'M';
        } else if (areaInput.equals("彰化縣")){
            return 'N';
        } else if (areaInput.equals("雲林縣")){
            return 'P';
        } else if (areaInput.equals("嘉義縣")){
            return 'Q';
        } else if (areaInput.equals("臺南縣")){
            return 'R';
        } else if (areaInput.equals("高雄縣")){
            return 'S';
        } else if (areaInput.equals("屏東縣")){
            return 'T';
        } else if (areaInput.equals("花蓮縣")){
            return 'U';
        } else if (areaInput.equals("臺東縣")){
            return 'V';
        } else if (areaInput.equals("澎湖縣")){
            return 'X';
        } else if (areaInput.equals("陽明山")){
            return 'Y';
        } else if (areaInput.equals("金門縣")){
            return 'W';
        } else if (areaInput.equals("連江縣")){
            return 'Z';
        } else if (areaInput.equals("嘉義市")){
            return 'I';
        } else if (areaInput.equals("新竹市")){
            return 'O';
        }
        throw new Exception("Invalid area: " + area);
    }
    public int mapAreaCode(char areaLetter) throws Exception {
        switch (areaLetter){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            case 'G':
                return 16;
            case 'H':
                return 17;
            case 'I':
                return 34;
            case 'J':
                return 18;
            case 'K':
                return 19;
            case 'M':
                return 21;
            case 'N':
                return 22;
            case 'O':
                return 35;
            case 'P':
                return 23;
            case 'Q':
                return 24;
            case 'T':
                return 27;
            case 'U':
                return 28;
            case 'V':
                return 29;
            case 'W':
                return 32;
            case 'X':
                return 30;
            case 'Z':
                return 33;
            default:
                throw new Exception("Invalid area letter: " + areaLetter);
        }
    }
    public String generator() throws Exception {
        Random random = new Random();
        StringBuilder middle = new StringBuilder();
        char areaCode = areaChecker(this.area);// 调用areaChecker方法获取回傳值
        int sexCode = sexChecker(this.sex);
        for (int i = 0; i < 7; i++) {
            int digit = random.nextInt(10);
            middle.append(digit);
        }
        char c1 = middle.charAt(0);
        int D2 = Character.getNumericValue(c1);
        char c2 = middle.charAt(1);
        int D3 = Character.getNumericValue(c2);
        char c3 = middle.charAt(2);
        int D4 = Character.getNumericValue(c3);
        char c4 = middle.charAt(3);
        int D5 = Character.getNumericValue(c4);
        char c5 = middle.charAt(4);
        int D6 = Character.getNumericValue(c5);
        char c6 = middle.charAt(5);
        int D7 = Character.getNumericValue(c6);
        char c7 = middle.charAt(6);
        int D8 = Character.getNumericValue(c7);

        int D0 = mapAreaCode(this.areaChecker(this.area));
        int X1 = D0 / 10;
        int X2 = D0 % 10;
        int Y = X1 + 9 * X2 + 8 * sexCode + 7 * D2 + 6 * D3 + 5 * D4 + 4 * D5 + 3 * D6 + 2 * D7 + D8;
        int CheckCode = (10 - (Y % 10)) % 10;

        String idString = String.valueOf(areaCode) + String.valueOf(sexCode) + String.valueOf(middle) + String.valueOf(CheckCode);

        return idString;
    }

}
