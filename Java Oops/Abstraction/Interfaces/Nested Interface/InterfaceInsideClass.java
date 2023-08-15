class Upper
{
    interface lower
    {
        void show();
    }
}

class Under implements Upper.lower
{
    @Override
    public void show()
    {
        System.out.println("Show Method of Interface");
    }
}

public class InterfaceInsideClass 
{
    public static void main(String[] args) 
    {
        Upper.lower  obj;
        Under a = new Under();
        obj = a;
        obj.show();
    }    
}
