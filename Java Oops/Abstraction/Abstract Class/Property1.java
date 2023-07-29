abstract class one 
{
    abstract void fun ();
}

class two extends one 
{
    public void fun ()
    {
        System.out.println("two fun () called");
    }
}

public class Property1 
{
public static void main(String[] args) 
{
    one a = new two();
    a.fun();
}    
}
