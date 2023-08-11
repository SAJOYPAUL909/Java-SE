abstract class A
{
    abstract void m1();

    public void m2 ()
    {
        System.out.println("m2 non-abstract method in abstract class");
    }

}

class B extends A
{
    public void m1()
    {
        System.out.println("Class B implementing m1 abstract method ");
    }
}

public class AbstractClass 
{
    public static void main(String[] args) 
    {
        B a = new B();
        a.m1();
        a.m2();
    }    
}
