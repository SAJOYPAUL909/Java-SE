class A
{
    int a , b, c;

    public void add (int x, int y)
    {
        a = x ;
        b = y ;
        System.out.println("Sum of X and Y are :"+(a+b) );
    }

    public void add (int x, int y ,int z)
    {
        a = x ;
        b = y ;
        c = z ;
        System.out.println("Sum of X,Y and Z are :"+(a+b+c) );
    }

    public void print()
    {
        System.out.println("This is Class A");
    }
}

class B extends A
{
    @Override
    public void print()
    {
        System.out.println("This is Class B");
    }
}



public class Polymorphism 
{
    public static void main (String args [])
    {
        System.out.println("\nCompile Time Polymorphism  /  Method Overloading");
        A a = new A();
        a.add(10,20);
        a.add(10,20,30);

        System.out.println("\nRun Time Polymorphism  /  Method Overriding");
        B b = new B();
        b.print();

    }    
}
