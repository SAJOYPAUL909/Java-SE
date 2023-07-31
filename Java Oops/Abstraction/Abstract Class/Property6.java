abstract class C 
{
    abstract class D
    {
        abstract void fun();
    }
}

class E extends C
{
    class F extends D
    {
        public void fun()
        {
            System.out.println("inside abstract method");
        }
    }

}

public class Property6 
{
    public static void main(String[] args) 
    {
        E outer = new E();
        E.F inner = outer.new F();
        inner.fun();
    }    
}
