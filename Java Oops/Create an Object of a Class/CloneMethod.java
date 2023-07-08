public class CloneMethod implements Cloneable
{
    void output()
    {
        System.out.println("Calling funnction by object");
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        CloneMethod t1 = new CloneMethod();
        CloneMethod t2 = (CloneMethod)t1.clone();
        t2.output();
    }
    
}
