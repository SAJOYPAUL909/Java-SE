class Super
{
    public Object m1()
    {

        System.out.println("Method in Super Class");
        return new Object();
    }
}

class Sub extends SubClass
{
    public String m1()
    {
        System.out.println("Method in Sub Class");
        return "Hello";
    }
}

public class Property5 
{
    public static void main(String[] args) 
    {
        Super a = new Super();
        a.m1();
        Sub b = new Sub();
        b.m1();

    }    
}
