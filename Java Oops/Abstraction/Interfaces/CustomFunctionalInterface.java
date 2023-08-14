interface Square
{
    int cal(int x);
}

public class CustomFunctionalInterface 
{
    public static void main(String[] args) 
    {
        int a = 5;

        Square s = (int x) -> x*x ;
         
        int ans = s.cal(a);
        System.out.println("Square of a = 5 is : "+ans ); 
    }    
}
