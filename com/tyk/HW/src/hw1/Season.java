package hw1;

public class Season {
    public static void main(String[] arg){
        int month = 4;

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("fall");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
