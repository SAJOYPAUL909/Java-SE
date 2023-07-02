public class Cmdinput
{
    public static void main(String[] args) 
    {
        if (args.length > 0)
        {
            System.out.println("This is command line argument");
            for (String a : args)
            {
                System.out.println(a);
            }
        }
        else 
        {
            System.out.println("No command line argument");
        }
        
    }
    
}
