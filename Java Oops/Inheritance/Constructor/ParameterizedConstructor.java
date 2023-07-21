class A
{
    int x;

    A(int x1)
    {
        x = x1;
    }

}


public class ParameterizedConstructor extends A
{
    int y;

    ParameterizedConstructor(int x1 ,int y1)
    {
        super(x1);//calling based clased single parameterized constructor
        y = y1;

    }

    void display ()
    {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) 
    {
        ParameterizedConstructor obj = new ParameterizedConstructor(10,20);
        obj.display();
    }    
}
