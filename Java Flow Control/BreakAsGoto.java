public class BreakAsGoto 
{
    public static void main(String[] args) 
    {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("before break");
                    if (t)
                    {
                        break second;
                       // System.out.println("yeah nahi chalega");
                    }
                    //System.out.println("yeah bhi nahi chalega");
                }
                System.out.println("before second block");
            }
            System.out.println("after second block");
        }

    }
}
