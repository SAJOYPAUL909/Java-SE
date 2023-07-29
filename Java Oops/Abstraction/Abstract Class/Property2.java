abstract class base 
{
    base()
    {
        System.out.println("Abstract class constructor");
    }
    abstract void fun ();
}
class derived extends base
{
    derived ()
    {
        System.out.println("Derived class constructor");

    }
    public void fun ()
    {
        System.out.println("Fun function ");
    }
}

public class Property2 
{
    public static void main(String[] args) 
    {
        derived d = new derived();
        d.fun();
        
    }    
}
