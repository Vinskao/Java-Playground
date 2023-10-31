package hw4;

public class IDGenerator2 {
    String hucoma;
    String value;
    public IDGenerator2(String hucoma, String value) {
        this.hucoma = hucoma;
        this.value = value;
    }
    public void IDmaker(){

    }
    public static void main(String[] args) {
        IDGenerator2[] checkIDArray = {
                new IDGenerator2("A","10"),
                new IDGenerator2("B","11"),
                new IDGenerator2("C","12"),
                new IDGenerator2("D","13"),
                new IDGenerator2("E","14"),
                new IDGenerator2("F","15"),
                new IDGenerator2("G","16"),
                new IDGenerator2("H","17"),
                new IDGenerator2("I","34"),
                new IDGenerator2("J","18"),
                new IDGenerator2("K","19"),
                new IDGenerator2("M","21"),
                new IDGenerator2("N","22"),
                new IDGenerator2("O","35"),
                new IDGenerator2("P","23"),
                new IDGenerator2("Q","24"),
                new IDGenerator2("T","27"),
                new IDGenerator2("U","28"),
                new IDGenerator2("V","29"),
                new IDGenerator2("W","32"),
                new IDGenerator2("X","30"),
                new IDGenerator2("Z","33"),
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
            for (IDGenerator2 object : checkIDArray){
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
