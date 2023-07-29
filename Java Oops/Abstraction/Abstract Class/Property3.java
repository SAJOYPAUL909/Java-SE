abstract class A
{
    void fun()
    {
        System.out.println("Non abstract method in Abstract class");
    }
}
class B extends A
{

}

public class Property3 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.fun();
        
    }    
}
