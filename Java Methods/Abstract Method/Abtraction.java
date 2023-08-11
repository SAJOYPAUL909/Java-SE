abstract class Arithmetic
{
    abstract void print();
} 

class add extends Arithmetic
{
    public void print()
    {
        int a = 21;
        int b = 12;
        System.out.println("Addition :"+(a+b));
    }
}

class sub extends Arithmetic
{
    public void print()
    {
        int a = 21;
        int b = 12;
        System.out.println("Substraction :"+(a-b));
    }
}



public class Abtraction 
{
    public static void main(String[] args) 
    {
        Arithmetic a = new add();
        a.print();
        Arithmetic b = new sub();
        b.print();
    }    
}
