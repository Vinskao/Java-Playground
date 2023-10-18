package hw4;

public class IDGenerator {
    String hucoma;
    String value;
    public IDGenerator(String hucoma, String value) {
        this.hucoma = hucoma;
        this.value = value;
    }
    public void IDmaker(){

    }
    public static void main(String[] args) {
        IDGenerator[] checkIDArray = {
                new IDGenerator("A","10"),
                new IDGenerator("B","11"),
                new IDGenerator("C","12"),
                new IDGenerator("D","13"),
                new IDGenerator("E","14"),
                new IDGenerator("F","15"),
                new IDGenerator("G","16"),
                new IDGenerator("H","17"),
                new IDGenerator("I","34"),
                new IDGenerator("J","18"),
                new IDGenerator("K","19"),
                new IDGenerator("M","21"),
                new IDGenerator("N","22"),
                new IDGenerator("O","35"),
                new IDGenerator("P","23"),
                new IDGenerator("Q","24"),
                new IDGenerator("T","27"),
                new IDGenerator("U","28"),
                new IDGenerator("V","29"),
                new IDGenerator("W","32"),
                new IDGenerator("X","30"),
                new IDGenerator("Z","33"),
        };

        boolean isID = false;
        String id = "A192321673";
        String inputHucoma = id.substring(0,1);
        if (id.length() != 10){
            System.out.println("Invalid ID");
        } else if ((id.charAt(0) < 'A' || id.charAt(0) > 'Z')){
            System.out.println("Invalid ID");
        } else if (id.charAt(1) != '1' && id.charAt(1) != '2'){
            System.out.println("Invalid ID");
        } else {
            for (int i = 2; i < id.length(); i++) {
                if (id.charAt(i) > '9' || id.charAt(i) < '0'){
                    System.out.println("Invalid ID");
                    return;
                }
            }
            String getValue = null;
            for (IDGenerator object : checkIDArray){
                if(object.hucoma.equals(inputHucoma)){
                    getValue = object.value;
                    break;
                }
            }
            int S = 0;
            S = Integer.parseInt(getValue.substring(0, 1),10) +
                Integer.parseInt(getValue.substring(1, 2),10) * 9 +
                Integer.parseInt(id.substring(1,2),10) * 8 +
                Integer.parseInt(id.substring(2,3),10) * 7 +
                Integer.parseInt(id.substring(3,4),10) * 6 +
                Integer.parseInt(id.substring(4,5),10) * 5 +
                Integer.parseInt(id.substring(5,6),10) * 4 +
                Integer.parseInt(id.substring(6,7),10) * 3 +
                Integer.parseInt(id.substring(7,8),10) * 2 +
                Integer.parseInt(id.substring(8,9),10) * 1
            ;
            int R = S % 10;
            String checkMa = Integer.toString(10 - R);
            if (id.substring(9, 10).equals(checkMa)){
                isID = true;
                System.out.println("ID is " + isID);
            } else {
                System.out.println("Fake ID");
            }
        }
    }
}
