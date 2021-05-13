package shape.circle;
import resize.ReSizeable;
import shape.Shape;

public class Circle extends Shape implements ReSizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double reSize(double percent) {
        return this.radius=this.radius*(1+percent/100);
    }

    @Override
    public String toString() {
        return "A shape.circle.Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}