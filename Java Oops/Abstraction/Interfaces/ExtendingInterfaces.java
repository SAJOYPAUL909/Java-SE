interface one 
{
    void m1();
    void m2();
}

interface two extends one
{
    void m3();
}

class ExtendingInterfaces implements two
{
    @Override
    public void m1()
    {
        System.out.println("Method 1");
    }

    @Override
    public void m2()
    {
        System.out.println("Method 2");
    }
    
    @Override
    public void m3()
    {
        System.out.println("Method 3");
    }
    

    public static void main(String[] args) 
    {
        ExtendingInterfaces obj = new ExtendingInterfaces();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}