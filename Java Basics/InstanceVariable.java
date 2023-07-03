class InstanceVariable
{
    public String k = "Sandeep is my friend";
    public int age = 12;

    public InstanceVariable()
    {
        this.k = k;
        this.age = age;

    }
    
    public static void main(String[] args)
    {
        InstanceVariable i = new InstanceVariable();  
        System.out.println("Name :"+i.k+"\nAge :"+i.age); 
    } 
}