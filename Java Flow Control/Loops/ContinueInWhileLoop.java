public class ContinueInWhileLoop 
{
    public static void main(String[] args) 
    {
        int x = 0;
        while (x<= 20)
        {
           
            if (x == 9 || x == 13 || x == 17 )
            {
                x++;
                continue;
            }
            
             System.out.println(x+" ");
             x++;

        }
    }    
}
