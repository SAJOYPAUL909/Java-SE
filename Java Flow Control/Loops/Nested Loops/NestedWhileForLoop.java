public class NestedWhileForLoop 
{
    public static void main(String[] args) 
    {
        int w = 4;
        int d = 7;
        int i = 1;

        while (i <= w) 
        {
            System.out.println("Week: " + i);
            for (int j = 1; j <= d; j++) 
            {
                System.out.println("  Days: " + j);
            }
            i++;
        }
    }
}
