abstract class FirstClass
{
    abstract void m1();
    abstract void m2();
    abstract void m3();

}

abstract class SecondClass extends FirstClass
{
    void m1()
    {
        System.out.println("m1 method");
    }
}

class ThirdClass extends SecondClass
{
    void m2()
    {
        System.out.println("m2 method");
    }

    void m3()
    {
        System.out.println("m3 method");
    }
}

public class Property8 
{
    public static void main(String[] args) 
    {
        ThirdClass m = new ThirdClass();
        m.m1();
        m.m2();
        m.m3();
    }    
}
