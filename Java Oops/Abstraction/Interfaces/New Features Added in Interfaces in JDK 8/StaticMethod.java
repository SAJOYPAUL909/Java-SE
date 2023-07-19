interface In2
{
    final int a = 10;
    static void display()
    {
        System.out.println("After JDK 8 interface can have Static Method  with body");
    }
}
public class StaticMethod implements In2
{
    public static void main(String[] args) 
    {
        In2.display();
    }    
}
