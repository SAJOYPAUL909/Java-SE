class Box 
{
    double width ,height ,depth ;

    Box (double w , double h , double d)
    {
        this.width = w;
        this.depth = d;
        this.height = h;

    }
    Box ()
    {
        width = depth = height = 0;
    }

    Box(double a)
    {
        width = depth = height = a ;   
    }

    double volume ()
    {
        return width * depth * height ;
    }

}


public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        Box a = new Box(10,20,30);
        Box b = new Box();
        Box c = new Box(10);

        System.out.println("Volume of box 1 : "+a.volume());
        System.out.println("Volume of box 2 : "+b.volume());
        System.out.println("Volume of box 3 : "+c.volume());

    }    
}
