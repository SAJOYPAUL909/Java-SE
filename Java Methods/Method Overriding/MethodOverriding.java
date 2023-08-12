class  Parent
{
    void show ()
    {
        System.out.println ("Parent's Show Method");
    }
} 

class Child extends Parent
{
    @Override
    void show()
    {
        System.out.println ("Child's Show Method");
    }
}



public class MethodOverriding
{
    public static void main(String[] args) 
    {
        Parent a = new Parent();
        a.show();

        Parent b = new Child();
        b.show();
    }
}
