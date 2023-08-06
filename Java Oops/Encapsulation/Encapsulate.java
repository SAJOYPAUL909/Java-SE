class Binding
{
    private String Name;
    private int RollNo;
    private int Age;

    public String getName()
    {
        return Name;
    }

    public int getRollNo()
    {
        return RollNo;
    }

    public int getAge()
    {
        return Age;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setRollNo(int RollNo)
    {
        this.RollNo = RollNo;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }
}



public class Encapsulate 
{
    public static void main(String[] args) 
    {
        Binding put = new Binding();
        put.setName("Sandeep");
        put.setAge(21);
        put.setRollNo(1002);

        System.out.println("Name : "+ put.getName() + "\nRoll no : "+put.getRollNo() + "\nAge : "+put.getAge());
    }    
}
