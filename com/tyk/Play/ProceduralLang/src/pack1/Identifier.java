package pack1;
public class Identifier {
    public String ID;
    private int Converter(char inputABC){
        char inputABCGood = Character.toUpperCase(inputABC);
        if (inputABCGood == 'A'){
            return 10;
        } else if (inputABCGood == 'B'){
            return 11;
        }
        System.out.println(inputABCGood);
        return inputABCGood;
    }
    public Identifier(String ID){ //setter
        System.out.println("ID= "+ID);
        this.ID = ID;
    }
    private boolean isRightFormat(String s){
        if (s == null){
            return false;
        }

        if (s.length() != 10){
            return false;
        }
        char cha = Character.toUpperCase(ID.charAt(0));
        if (cha < 'A' || cha > 'Z'){
            return false;
        }

        for (int i=1; i<10; i++){
            char c = ID.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
    public boolean validator() {
        if (!this.isRightFormat(this.ID)){
            System.out.println("typo");
            return false;
        }
        char ch = this.ID.charAt(0);
        int D0 = this.Converter(ch);

        int D1 = Integer.parseInt(ID.substring(1, 2));
        int D2 = Integer.parseInt(ID.substring(2, 3));
        int D3 = Integer.parseInt(ID.substring(3, 4));
        int D4 = Integer.parseInt(ID.substring(4, 5));
        int D5 = Integer.parseInt(ID.substring(5, 6));
        int D6 = Integer.parseInt(ID.substring(6, 7));
        int D7 = Integer.parseInt(ID.substring(7, 8));
        int D8 = Integer.parseInt(ID.substring(8, 9));
        int D9 = Integer.parseInt(ID.substring(9, 10));

        int X1 = D0 / 10;
        int X2 = D0 % 10;
        int Y = X1 + 9 * X2 + 8 * D1 + 7 * D2 + 6 * D3 + 5 * D4 + 4 * D5 + 3 * D6 + 2 * D7 + D8;
        int CheckCode = (10 - (Y % 10)) % 10;

        if (CheckCode == D9) {
            return true;
        } else {
            return false;
        }
    }
}
