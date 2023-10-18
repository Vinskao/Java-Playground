package pack1;

public class Identifier {
    public String ID = "A123456789";
    public String[][] inputABC = {
            {"A","10"},

    };
    public Identifier(String ID){ //setter
        System.out.println("ID= "+ID);
        this.ID = ID;
    }
    public boolean validator(){
        int Y = 0;
//        Y = X1+ 9*X2+ 8*D1+ 7*D2+ 6*D3+ 5*D4+4*D5+ 3*D6+ 2*D7+ D8
        int CheckCode;
        CheckCode = (10-(Y % 10)) % 10;
    return true;
    }

}
