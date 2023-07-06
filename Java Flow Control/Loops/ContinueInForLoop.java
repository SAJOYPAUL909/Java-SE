class ContinueInForLoop
{
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 20; i++) 
        {
            if (i == 10 || i == 15) 
            {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}