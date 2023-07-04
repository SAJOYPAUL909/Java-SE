public class NestedWhileLoop 
{
   public static void main(String[] args) 
   {
        int i = 1, j = 1;
        while (i <= 3) 
        {
            while (j <= 6) 
            {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println("");
            j = 1;
        } 
    }
}
