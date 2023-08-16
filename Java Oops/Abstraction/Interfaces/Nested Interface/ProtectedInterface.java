class A
{
    protected interface H
    {
        void show ();
    }
}

class B implements A.H
{
    public void show()
    {
        System.out.println("Show Method of protected Interface inside a class that is implemented in another class");
    }
}

public class ProtectedInterface 
{
    public static void main(String[] args) 
    {
        A.H obj ;
        B a = new B();
        obj = a;
        obj.show();
    }    
}
