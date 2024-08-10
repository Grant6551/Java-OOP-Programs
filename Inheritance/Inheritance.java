/* Author: Joshua Grant Kana
Purpose: Demonstrate inheritance
version: 1.0
creation date: 09/11/23
*/

class Circle {
    protected double radius;

    public Circle() {
        radius = 4.0;
    }

    public Circle(double r) {
        radius = r;
    }

    final static double PI = 3.142;

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return (PI * radius * radius);
    }

    public double perimeter() {
        return (2 * PI * radius);
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 0.0;
    }

    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return (PI * radius * radius * height);
    }
}

public class inheritance {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(20.3);
        double area = c.area();
        double perimeter = c.perimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        Cylinder cyl = new Cylinder(20.3, 10.0);
        double volume = cyl.volume();
        System.out.println("Volume of Cylinder: " + volume);
    }
}
