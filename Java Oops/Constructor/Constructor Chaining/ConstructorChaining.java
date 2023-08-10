class ConstructorChaining
{
    ConstructorChaining()
    {
        this(5);
        System.out.println("Non Parameterized Constructor ");
    }

    ConstructorChaining(int a)
    {
        this(5, 10);
        System.out.println("a = : "+a);
        System.out.println("Parameterized Constructor with one argument\n");
    }

    ConstructorChaining(int a , int b)
    {
        System.out.println("a * b : "+a*b);
        System.out.println("Parameterized Constructor with two argument\n");

    }
    

    public static void main(String[] args) 
    {
       new ConstructorChaining() ;
    }
}