interface A 
{
    void hello();
}
interface B extends A
{
    void hi();
}

public class InterfacesInheritance implements B
{
 
    @Override
    public void hello()
    {
        System.out.println("hello");
    }

    @Override
    public void hi()
    { 
        System.out.println("hi");
    }


    public static void main(String[] args) 
    {
        InterfacesInheritance obj = new InterfacesInheritance();
        obj.hello();
        obj.hi();
    }    
}
