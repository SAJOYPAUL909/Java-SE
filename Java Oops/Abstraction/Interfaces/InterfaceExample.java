interface Inter1
{
    final int a = 10;
    void display();

}

public class InterfaceExample implements Inter1
{
    @Override
    public void display()
    {
        System.out.println("Sandeep");
    }
    public static void main(String[] args) 
    {
        InterfaceExample obj  = new InterfaceExample();
        obj.display();
        System.out.println(a);
    }
}
