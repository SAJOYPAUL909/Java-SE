interface hello
{
    public void hi();
}

public class InterfaceEx implements hello  
{
    public void hi()
    {
        System.out.println("Abstract method override to derived class from interface");
    }
    public static void main(String[] args) 
    {
        InterfaceEx obj = new InterfaceEx();
        obj.hi();
    }    
}
