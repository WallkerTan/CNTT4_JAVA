package SRC.session9;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
class Rectangle extends Shape {

    private double width;
    private double height;

    // Constructor hình chữ nhật
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor hình vuông (Overloading)
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

}
public class s9_ex6 {
    public static void main(String[] args) {
         Shape c = new Circle(5);

        Shape r1 = new Rectangle(4, 6);

        Shape r2 = new Rectangle(3);

        System.out.println("Circle area: " + c.calculateArea());

        System.out.println("Rectangle area: " + r1.calculateArea());

        System.out.println("Square area: " + r2.calculateArea());

    }
}
