public class FunctionalInterface 
{
    public static void main(String[] args) 
    {
        new Thread(new Runnable()
        {
            public void run ()
            {
                System.out.println("Thread created ");
            }
        }   
        ).start();

        System.out.println("Functional Interface");
    }    
}
