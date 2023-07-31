abstract class Demo 
{
    abstract void m1();
}

class Demo2 extends Demo
{
    public void m1()
    {
        System.out.println("Hello");
    }
}

public class Property7 
{
    public static void main(String[] args) 
    {
        Demo2 obj = new Demo2();
        obj.m1();
    }    
}
