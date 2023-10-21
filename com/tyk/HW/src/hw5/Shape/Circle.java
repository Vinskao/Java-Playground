package hw5.Shape;

public class Circle implements Shape {
    private double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double computeArea() {
        System.out.println(r * r * Math.PI);
        return r * r * Math.PI;
    }
    @Override
    public double computeCircumference() {
        System.out.println(2 * r * Math.PI);
        return 2 * r * Math.PI;
    }
}
