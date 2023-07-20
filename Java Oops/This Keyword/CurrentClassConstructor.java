public class CurrentClassConstructor 
{
    int a;
    int b;
 
    CurrentClassConstructor()
    {
        this(10, 20);
        System.out.println("Non-Parameterized Constructor");
    }
    CurrentClassConstructor(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println( "Parameterized Constructor called by this() ");
    }
    public static void main(String[] args) 
    {
        CurrentClassConstructor obj = new CurrentClassConstructor();
        System.out.println("A = "+obj.a);
    }    
}
