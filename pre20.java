abstract class Shape1
{
    abstract double area();
}
class Triangle1 extends Shape1
{
    private double base;
    private double height;
    public Triangle1(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    double area()
    {
        return 0.5 * base * height;
    }
}
class Rectangle1 extends Shape1
{
    private double length;
    private double width;
    public Rectangle1(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    double area()
    {
        return length * width;
    }
}


class Circle1 extends Shape1
{
    private double radius;
    public Circle1(double radius)
    {
        this.radius = radius;
    }
    double area()
    {
        return Math.PI * radius * radius;
    }
}

public class pre20
{
    public static void main(String[] args)
    {
        Triangle1 triangle = new Triangle1(5, 8);
        Rectangle1 rectangle = new Rectangle1(4, 6);
        Circle1 circle = new Circle1(3);

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
