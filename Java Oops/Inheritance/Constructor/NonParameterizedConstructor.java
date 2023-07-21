class Base
{
    Base()
    {
        System.out.println("Base class constructor");
    }
}


public class NonParameterizedConstructor extends Base
{
    int x = 10;
    NonParameterizedConstructor()
    {
        System.out.println("Derived class constructor");
    }

    public static void main(String[] args) 
    {
        NonParameterizedConstructor obj = new NonParameterizedConstructor();
         System.out.println(obj.x);
    }    
}
