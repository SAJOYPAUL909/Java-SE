class Student
{
    public void m1(String Name , int Roll_No)
    {
        System.out.println("Name : "+Name+"\tRoll No : "+Roll_No);
    }

    public void m1 (int Roll_No ,String Name)
    {   
        System.out.println("Roll No : "+Roll_No +"\tName : "+Name);
    }
}

public class Overloading3 
{
    public static void main(String[] args) 
    {
        Student a = new Student();
        a.m1("Aman",01);
        a.m1(02, "Sandeep");    
    }
    

}
