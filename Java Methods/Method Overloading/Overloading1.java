class Addition
{
    public int sum (int a , int b)
    {
        return  a+b;
    }

    public int sum (int a , int b , int c)
    {
        return  a+b+c;
    }
}


public class Overloading1 
{


    public static void main (String args [])
    {
        Addition a = new Addition();
        int add1 = a.sum(12, 23);
        System.out.println("Sum of Two integer : "+add1);

        
        int add2 = a.sum(12, 23,6);
        System.out.println("Sum of Three integer : "+add2);
    }    
}
