public class CurrentClassInstance 
{
    int a;
    int b;
    CurrentClassInstance()
    {
        a = 10;
        b = 20;
    }

    CurrentClassInstance get()
    {
        return this;
    }

    void display()
    {
        System.out.println("A = "+ a+" B = "+b);
    }

    public static void main(String[] args) 
    {
        CurrentClassInstance obj = new CurrentClassInstance();
        obj.get().display();
    }    
}
