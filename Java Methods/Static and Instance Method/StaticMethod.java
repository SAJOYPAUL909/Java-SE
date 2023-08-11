class Hello 
{
    static String Name = "";
    
    public static void m1 (String Name)
    {
        Hello.Name = Name;
        System.out.println("Static Method "+Name);
    }
}

public class StaticMethod 
{
    public static void main(String[] args) 
    {
        Hello.m1(" Without Creating Object");
        
        Hello a = new Hello();
        a.m1("Creating object");
    }    
}
