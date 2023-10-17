package Parent;

public class method {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.setF1(10);
//        p.print();
//
//        Parent p1 = new Parent();
//        p1.print();

//        Child c = new Child();
//        c.print();

        Child c1 = new Child(111,222);
        c1.print();

        Child c2 = new Child();
        c2.setF1(111);
        c2.setF2(222);
        c2.print();
    }

}
