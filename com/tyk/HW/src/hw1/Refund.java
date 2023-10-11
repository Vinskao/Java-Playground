package hw1;

public class Refund {
    public static void main(String[] args) {
        double p = 1000; //實付金額
        double np = 9; //應付金額
        int a = 1000;
        int b = 500;
        int c = 100;
        int d = 50;
        int e = 10;
        int f = 5;
        int g = 1;

        //找錢
        int pba = 0;
        int pbb = 0;
        int pbc = 0;
        int pbd = 0;
        int pbe = 0;
        int pbf = 0;
        int pbg = 0;

        if (p < np){
            System.out.println("金額不足");
        } else if (p == np){
            System.out.println("不必找錢");
        } else {
            pba = (int)((p - np) / a);
            pbb = (int)((p - np) % a / b);
            pbc = (int)((p - np) % b / c);
            pbd = (int)((p - np) % c / d);
            pbe = (int)((p - np) % d / e);
            pbf = (int)((p - np) % e / f);
            pbg = (int)((p - np) % f / g);

        }
        System.out.println("1000:" + pba);
        System.out.println("500:" + pbb);
        System.out.println("100:" + pbc);
        System.out.println("50:" + pbd);
        System.out.println("10:" + pbe);
        System.out.println("5:" + pbf);
        System.out.println("1:" + pbg);
    }

}
