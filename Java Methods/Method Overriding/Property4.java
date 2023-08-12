class SuperClass {
    private void privateMethod()
    {
        System.out.println(
            "This is a private method in SuperClass");
    }
 
    public void publicMethod()
    {
        System.out.println(
            "This is a public method in SuperClass");
        privateMethod();
    }
}


class SubClass extends SuperClass
{
     private void privateMethod()
    {
        System.out.println(
            "This is a private method in SubClass");
    }
    public void publicMethod()
    {
        System.out.println(
            "This is a public method in SuperClass");
        privateMethod();
    }

}

public class Property4 
{
    public static void main(String[] args) 
    {
        SuperClass a = new SuperClass();
        a.publicMethod();

        SubClass b = new SubClass();
        b.publicMethod();
    }    
}
