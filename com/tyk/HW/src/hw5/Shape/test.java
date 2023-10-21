package hw5.Shape;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.computeArea();
        circle.computeCircumference();
        Rectangle rect = new Rectangle(20,30);
        rect.computeArea();
        rect.computeCircumference();
    }
}
