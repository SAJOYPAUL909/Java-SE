class First
{
    void show ()
    {
        System.out.println("Parent's Class Method");
    }
}
class Second extends First
{

    void show()
    {
        super.show();
        System.out.println("Child's class Method");
    }
}

public class Property6 
{
    public static void main(String[] args) 
    {
        First a = new Second();
        a.show();
    }    
}
