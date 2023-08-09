class Dimension
{
    double width, height , depth;
    int id; 

    Dimension(double w , double h , double d ,int id)
    {
        width = w;
        height = h;
        depth = d;
        this.id = id;
    }

    Dimension()
    {
        width = height = depth = 0 ;
    }

    Dimension(int id)
    {
        this();
        this.id = id;
    }

    public double volume()
    {
        return width * height * depth;
    }

}



public class UsingThis 
{
    public static void main(String[] args) 
    {
        Dimension a = new Dimension(21);
        System.out.println("Volume : "+a.volume() +"\n width :"+a.width+" height : "+a.height+" depth : "+a.depth+" id : "+a.id);
    }    
}
