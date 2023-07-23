interface A1
{
     default void show()
    {
        System.out.println("Default A1");
    }
}

interface B1
{
    default void show()
    {
        System.out.println("Default B1");
    }
}

class MultipleInheritance implements A1,B1
{
    public void show()
    {
        A1.super.show();
        B1.super.show();
    }

    public void showA1()
    {
         A1.super.show();
    }

    public void showB1()
    {
         B1.super.show();
    }

    public static void main(String[] args) 
    {
        MultipleInheritance obj = new MultipleInheritance();
        obj.show();
        System.out.println("calling by seperate methods");
        obj.showA1();
        obj.showB1();

    }
}