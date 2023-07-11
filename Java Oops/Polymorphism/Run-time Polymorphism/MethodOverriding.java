class parent 
{
    void m1()
    {
        System.out.println("M1 from parent class");
    }
}
class child extends parent
{
    @Override
    void m1 ()
    {
        System.out.println("M1 from child class");
    }

}



public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        parent obj = new parent();
        obj.m1();
    }    
}
