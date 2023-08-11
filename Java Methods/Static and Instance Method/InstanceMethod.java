class A
{
    String Name = "";
    public void m1 (String Name )
    {
        this.Name = Name;
        System.out.println("Instance Method"+Name);

    }
}

class InstanceMethod
{
    public static void main(String[] args) 
    {
        A a  = new A();
        a.m1(" Needs Object refernce");
    }
}