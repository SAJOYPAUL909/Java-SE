public class InstanceMethod 
{

    void name ()
    {
        System.out.println("Instance Method calling by object inside a class");

    }
    public static void main(String[] args) 
    {
        InstanceMethod  obj = new InstanceMethod();
        obj.name();
    }
}
