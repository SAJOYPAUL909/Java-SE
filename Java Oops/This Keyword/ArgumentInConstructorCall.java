class A
{
    ArgumentInConstructorCall obj;

    A (ArgumentInConstructorCall obj)
    {
        this.obj = obj;
        obj.display();
    }
    
}

public class ArgumentInConstructorCall 
{

    int a = 100;
    ArgumentInConstructorCall()
    {
        A obj = new A(this);
    }

    void display()
    {
        System.out.println("The value of A in class B is :"+a+" \nThis method is called by constructor of class A by the help of Arguments in constructor call");

    }

    public static void main(String[] args) 
    {
        ArgumentInConstructorCall obj = new ArgumentInConstructorCall();
    }    
}
