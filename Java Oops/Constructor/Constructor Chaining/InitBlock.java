public class InitBlock 
{
    {
        System.out.println("Init block");
    }

    InitBlock()
    {
        System.out.println("Non-Parameterized constructor");
    }

    InitBlock(int a)
    {
        System.out.println("Parameterized Constructor \n A: "+a);
    }
    public static void main(String[] args) 
    {
        new InitBlock(10);
        new InitBlock();
    }    
}
