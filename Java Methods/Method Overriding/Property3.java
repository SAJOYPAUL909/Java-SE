class One
{
    static void m1 ()
    {
        System.out.println("Parent's M1 static");
    }

    void m2()
    {
        System.out.println("Parent's M2 Non-Static");
    }
}

class Two extends One
{
    static void m1 ()
    {
        System.out.println("Child's M1 static");
    }

    void m2()
    {
        System.out.println("Child's M2 Non-Static");
    }
}

public class Property3 
{
    public static void main(String[] args) 
    {
        One a = new Two();
        System.out.println("Hiding");
        a.m1();
        System.out.println("Overriding");
        a.m2();    
    }
    
}
