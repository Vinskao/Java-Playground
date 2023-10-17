package Parent;

public class Child extends Parent {
    private int f2;
    public Child() {
        super();
    }
    public Child(int f1 , int f2){
        super(f1);
//super(f1) 调用了 Parent 类的构造函数，将 111 传递给了 Parent 类的 int f1 参数
        this.f2 = f2;
    }
    public int getF2() {
        return f2;
    }
    public void setF2(int f2) {
        this.f2 = f2;
    }
    public void print(){ //overwrite parent if public
        super.print();
        System.out.println("f2= " + f2);
   }
}

