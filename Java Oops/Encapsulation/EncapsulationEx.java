class Person
{
    private String name;
    private int age;
 
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

     public int getAge()
    {
        return age;
    }
}

public class EncapsulationEx 
{
    public static void main(String[] args) 
    {
        Person obj = new Person();
        obj.setName("Java");
        obj.setAge(28);

        System.out.println("Name : "+obj.getName());
        System.out.println("Age : "+obj.getAge());


    }    
}
