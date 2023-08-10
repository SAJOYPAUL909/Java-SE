class Base
{
    String Name;
    Base()
    {
        System.out.println("Base Class Non-Parameterized Constructor");

    }

    Base(String Name)
    {
        this.Name = Name;
        System.out.println("Base Class Parameterized ");
    }
}

public class InhertanceConstructor extends Base
{

    InhertanceConstructor()
    {
        System.out.println("Derived class Non Parameterized Constructor");
    }

    InhertanceConstructor(String Name)
    {
        super("Sandeep");
        System.out.println("Based class Parameterized Constructor");


    }
    public static void main(String[] args) 
    {
        System.out.println("Calling Parameterized Constructor");
        new InhertanceConstructor("Sand");

        System.out.println("\nCalling Non Parameterized Constructor");
        new InhertanceConstructor();
    }    
}
