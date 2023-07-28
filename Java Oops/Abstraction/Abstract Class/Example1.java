abstract class Shape
{
    public abstract double getArea();
}

class Circle extends Shape
{
    private double radius;

Circle(double radius)
{
    this.radius = radius;
}

    public double getArea()
    {
        return Math.PI * radius *  radius ;
    }


}

class Rectangle extends Shape
{
    private double width;
    private double height;

    Rectangle(double width, double height)
    {
        this.height = height;
        this.width = width;

    }

    public double getArea()
    {
        return width * height;
    }

}

public class Example1 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(24, 5);

        System.out.println("Area of circle : "+ circle.getArea() + "\nArea of Rectangle : "+ rectangle.getArea());
    }    
}
