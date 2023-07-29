abstract class parent 
{
    final void fun ()
    {
        System.out.println("parent function");
    }
} 

class child extends parent
{

}

public class Property4 
{
    public static void main(String[] args) 
    {
        parent obj = new child();
        obj.fun();
    }    
}
