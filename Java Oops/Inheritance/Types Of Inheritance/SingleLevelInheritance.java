class one //parent or super or base class
{
    void m1 ()
    {
        System.out.println("Class one");
    }
}

class two extends one //child or sub or Derived class
{
    void m2 ()
    {
        System.out.println("Class two");
    }
}

public class SingleLevelInheritance 
{
    public static void main(String[] args) 
    {
        two obj = new two();
        obj.m1();
        
    }    
}
