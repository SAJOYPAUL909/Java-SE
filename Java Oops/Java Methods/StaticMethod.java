public class StaticMethod 
{
    static void name()
    {
        System.out.println("calling a Static method by class name");
    }
    public static void main(String[] args) 
    {
        StaticMethod.name();
    }
}
