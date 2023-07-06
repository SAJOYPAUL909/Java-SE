public class ContinueInDoWhileLoop 
{
    public static void main(String[] args) 
    {
        int x = 0;
        do 
        {
            
            x++;
            if (x == 9 || x == 13 || x ==17 || x == 23)
            {
                continue;
            }
            System.out.println(x+" ");

        }while (x < 30);
    }
}
