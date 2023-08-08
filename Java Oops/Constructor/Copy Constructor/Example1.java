class One
{
    private String Name;
    private int Age;

    public One(String Name , int Age )
    {
        this.Name = Name;
        this.Age = Age;
    }

    public One(One obj)
    {
        this(obj.Name, obj.Age);
        System.out.println("Copy Construction");
    }

    @Override
    public String toString()
    {
        return "Name : "+ Name + " Age : "+ Age;
    }

}
public class Example1 
{
    public static void main(String[] args) 
    {
         One a = new One("Sandeep", 23);

         One b = new One(a);

         One c = b;
         System.out.println(c);
    }    
}
