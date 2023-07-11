abstract class Abstraction
{
     public void hello()
    {
        System.out.println("hello function in Abstract class");
    }
     abstract public void hi();
    
} 

public class AbstractClassEx extends Abstraction
{

    @Override
    public void hi ()
    {
        System.out.println("hi function overriden in derived class");
    }
    public static void main(String[] args) 
    {
        Abstraction a =new AbstractClassEx();
        a.hello();
        a.hi();
    }    
}
