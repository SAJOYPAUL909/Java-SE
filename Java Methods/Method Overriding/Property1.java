class Base
{
    private void m1()
    {
        System.out.println("Base M1 method");
    }

    protected void m2 ()
    {
        System.out.println("Base m2 Method");
    }
}

class Derived extends Base
{
    private void m1()
    {
        System.out.println("Derived M1 method");
    }

    protected void m2 ()
    {
        System.out.println("Derived m2 Method");
    }
}
public class Property1 
{
    public static void main(String[] args) 
    {
        Base a = new Base();
        a.m2();
        
        Base b = new Derived();
        b.m2();
    }    
}
