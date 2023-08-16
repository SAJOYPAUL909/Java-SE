interface Outter
{
    interface Inner
    {
        void show();
    }
}

class Details implements Outter.Inner
{
    public void show()
    {
        System.out.println("Show Method of Interface inside another interface override in another class");
    }
}

public class InterfaceInInterface 
{
    public static void main(String[] args) 
    {
        Outter.Inner obj;
        Details a = new Details();
        obj = a;
        obj.show();
    }    
}
