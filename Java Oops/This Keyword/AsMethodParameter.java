public class AsMethodParameter 
{

    int a;
    int b;
    AsMethodParameter()
    {
        a = 10;
        b = 20;
    }

    void display(AsMethodParameter object)
    {
        System.out.println("A = "+a+" B ="+b);

    }

    void get ()
    {
        display(this);
    }

    public static void main(String[] args) 
    {

        AsMethodParameter obj = new AsMethodParameter();
        obj.get();
    }    
}
