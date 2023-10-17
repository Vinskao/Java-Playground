package Parent;

public class Parent {
    private int f1;
    public Parent(){
    }
    public Parent(int f1){
        this.f1 = f1;
    }
    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }
    public void print() {
        System.out.println("f1= " + f1);
    }
}
