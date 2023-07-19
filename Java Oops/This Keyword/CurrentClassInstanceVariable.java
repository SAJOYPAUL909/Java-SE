public class CurrentClassInstanceVariable 
{
    int a ;
    int b ;

    CurrentClassInstanceVariable(int a , int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("A : "+a+" B : "+b);
    }

    public static void main(String[] args) 
    {
        CurrentClassInstanceVariable obj = new CurrentClassInstanceVariable(10, 29);
        obj.display();
    }    
}
