package hw5.Shape;

public class Rectangle implements Shape{
    private double side1;
    private double side2;
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double computeArea() {
        System.out.println(side1 * side2);
        return side1 * side2;
    }
    @Override
    public double computeCircumference(){
        System.out.println(2*(side2+side1));
        return 2*(side2+side1);
    }
}
