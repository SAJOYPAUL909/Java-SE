interface In1
{
    final int a = 10;
    default void display()
    {
        System.out.println("After JDK 8 interface can have Methods with body by using default keyword ");
    }
}

class DefaultMethod implements In1
{
    public static void main(String[] args) 
    {
        DefaultMethod obj = new DefaultMethod();
        obj.display();
    }
}