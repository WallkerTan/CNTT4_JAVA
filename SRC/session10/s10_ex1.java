package SRC.session10;

interface Shape {
    double getArea();
    double getPerimeter();
    void out();
}

class Circle implements Shape{

    private double radius;
    final double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 2*pi*this.radius;
    }
    public double getPerimeter(){
        return pi*this.radius*this.radius;
    }
    public void out(){
        System.out.printf("chu vi: %.2f\ndien tich: %.2f\n",2*pi*this.radius,pi*this.radius*this.radius);
    }
}

class Rectangle implements Shape{
    private double w;
    private double h;

    public Rectangle(double w,double h){
        this.w = w;
        this.h = h;
    }
    public Rectangle(double w){
        this.w = w;
        this.h = w;
    }
    public double getArea(){
        return 2*(w+h);
    }
    public double getPerimeter(){
        return w*h;
    }
    
    public void out(){
        System.out.printf("chu vi: %.2f\ndien tich: %.2f\n",2*(w+h),w*h);
    }
}

public class s10_ex1 {
    public static void main(String[] args) {
        Shape ht = new Circle(1);
        Shape hcn = new Rectangle(1,2);
        Shape hv = new Rectangle(2);

        ht.out();
        hcn.out();
        hv.out();
    }
}
