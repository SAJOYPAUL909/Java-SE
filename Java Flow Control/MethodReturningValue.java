class MethodReturningValue 
{
    double RR(double a, double b)
    {
        double sum = 0;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) 
    {
        MethodReturningValue obj = new MethodReturningValue();
        System.out.println(obj.RR(2433,2343 ));
        
    }
}