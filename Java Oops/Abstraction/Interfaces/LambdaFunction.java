class LambdaFunction
{
    public static void main(String[] args) 
    {
        new Thread(() -> { System.out.println("Thread created ");}).start();    
    }

}