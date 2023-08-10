public class RandomOrder 
{
    RandomOrder()
    {
        System.out.println("Non parameterized");
    }

    RandomOrder(int x  )
    {
        this();
        System.out.println("parameterized with one argument");
        System.out.println("x : "+x);
    }

    RandomOrder(int x , int y)
    {
        this(x);
        System.out.println("parameterized with two argument");
        System.out.println("x : "+x+ " y : "+y);
    }

    public static void main (String args [])
    {
       new RandomOrder(12,4);
    }    
}
