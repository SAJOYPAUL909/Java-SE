class Base
{
    public void m1()
    {
        System.out.println("m1 from Base class");
    }
}

class Derived extends Base
{
    public void m2()
    {
        System.out.println("m2 from Derived class");
    }
}

public class InheritanceEx 
{
    public static void main(String[] args)
     {
        Derived d = new Derived();
        d.m1();
        
    }    
}
