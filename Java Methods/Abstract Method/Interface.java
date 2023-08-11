interface Sum
{
    int Opration_2(int a , int b);
    int Opration_3(int a, int b , int c);
}
public class Interface implements Sum
{

    public int Opration_2(int a ,int b)
    {
        return a+b;
    }

    public int Opration_3(int a ,int b ,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) 
    {
        Sum a = new Interface();
        System.out.println(a.Opration_2(10,20)+" \n"+ a.Opration_3(10, 20, 30));  
       
    }    
}
