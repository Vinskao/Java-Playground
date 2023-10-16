package hw4;

public class CheckID {
    String hucoma;
    String value;
    public CheckID(String hucoma, String value) {
        this.hucoma = hucoma;
        this.value = value;
    }
//    public transit(int){
//
//    }
    public static void main(String[] args) {
        CheckID checkID = new CheckID("A","10");
        boolean isID = false;
        String id = "f123436739";
        if (id.length() != 10){
            System.out.println("Invalid ID");
        } else if ((id.charAt(0) < 'A' || id.charAt(0) > 'Z') && (id.charAt(0) < 'a' || id.charAt(0) > 'z')){
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
            if (id.charAt(9) == '0'){

            }
            isID = true;
            System.out.println("Valid ID" + isID);
        }
    }
}
