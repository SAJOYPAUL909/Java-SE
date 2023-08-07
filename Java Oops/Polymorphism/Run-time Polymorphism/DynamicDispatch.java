class A
{
    void m1 ()
    {
        System.out.println("M1 in Class A");
    }
}

class B extends A
{
    @Override
    void m1 ()
    {
        System.out.println("M1 in Class B");
    }
}

class C extends A
{
    @Override
    void m1 ()
    {
        System.out.println("M1 in Class C");
    }
}

public class DynamicDispatch 
{
    public static void main(String[] args) 
    {
        A a = new A();
        B b = new B();
        C c = new C();    

        System.out.println("\nObtaining a  Reference of Type A");
        A ref;

        System.out.println("\nRef refernce to A object");
        ref = a;
        ref.m1();

        System.out.println("\nRef refernce to B object");
        ref = b;
        ref.m1();

        System.out.println("\nRef refernce to C object");
        ref = c;
        ref.m1();

    }
    

    
}
