public class MultiInitBlock 
{
    {
        System.out.println("First Init Block");
    }

    MultiInitBlock()
    {
        System.out.println("Non parameterized Constuctor");
    }

    MultiInitBlock(int x)
    {
        System.out.println("Parameterized Constructor");
    }

    {
        System.out.println("Second Init Block");
    }
    public static void main(String[] args) 
    {
        new MultiInitBlock();
        new MultiInitBlock(12);
    }    
}
