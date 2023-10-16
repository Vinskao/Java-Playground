package hw4;

public class CheckID {
    String hucoma;
    String value;
    public CheckID(String hucoma, String value) {
        this.hucoma = hucoma;
        this.value = value;
    }
    public static void main(String[] args) {
        CheckID[] checkIDArray = {
                new CheckID("A","10"),
                new CheckID("B","11"),
                new CheckID("C","12"),
                new CheckID("D","13"),
                new CheckID("E","14"),
                new CheckID("F","15"),
                new CheckID("G","16"),
                new CheckID("H","17"),
                new CheckID("I","34"),
                new CheckID("J","18"),
                new CheckID("K","19"),
                new CheckID("M","21"),
                new CheckID("N","22"),
                new CheckID("O","35"),
                new CheckID("P","23"),
                new CheckID("Q","24"),
                new CheckID("T","27"),
                new CheckID("U","28"),
                new CheckID("V","29"),
                new CheckID("W","32"),
                new CheckID("X","30"),
                new CheckID("Z","33"),
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
            for (CheckID object : checkIDArray){
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
