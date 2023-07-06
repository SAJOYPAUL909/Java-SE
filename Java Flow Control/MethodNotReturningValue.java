public class MethodNotReturningValue 
{
    void sum(int a,int b)
    {
        int sum = 0;
        sum = (a + b) / 10;
        System.out.println(sum);
    }
    public static void main(String[] args) 
    {
        MethodNotReturningValue obj = new MethodNotReturningValue();
        obj.sum(26,21); 
    }
}
