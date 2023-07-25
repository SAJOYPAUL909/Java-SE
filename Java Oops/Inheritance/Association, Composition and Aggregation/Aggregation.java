import java.util.*;

class Students
{
    String name;
    int id ;
    String dept;

    Students(String name , int id , String dept)
    {
        this.name= name;
        this.id = id;
        this.dept = dept;

    }

}


class Department
{
    String name;
    private List<Students> students;

    Department(String name,List<Students> students)
    {
        this.name = name;
        this.students = students;
    }

    public List<Students> getstudents()
    {
        return students;
    }

}

class  Institute
{
    String instituteName;
    private List<Department> departments;

    Institute(String instituteName, List<Department> departments)
    {
        this.instituteName = instituteName;
        this.departments = departments;

    }

    public int getTotal()
    {
        int number = 0;
        List <Students> students;

        for (Department dept : departments)
        {
            students = dept.getstudents();

            for (Students s : students)
        {
            number++;
        }

        }
        

        return number;
    }

}

public class Aggregation 
{
    public static void main(String[] args) 
    {
       Students s1 = new Students("Aman", 01, "CSE");
       Students s2 = new Students("Abhishek", 02, "CSC");
       Students s3 = new Students("Arjit", 01, "IT");
       Students s4 = new Students("Aakash", 02, "IT");

       List<Students> cse_students = new ArrayList<Students>();
        cse_students.add(0, s1);
        cse_students.add(0, s2);

       List<Students> it_students = new ArrayList<Students>();
        it_students.add(0, s3);
        it_students.add(0, s4);

        Department CSE = new Department("CSE", cse_students);
        Department IT = new Department("IT", it_students);

        List <Department> departments = new ArrayList<Department>();
        departments.add(0, IT);
        departments.add(0, CSE);

        Institute institute = new Institute("BGIEM", departments);

        System.out.println("Total numbers of students : "+institute.getTotal());

    
    
    }    
}
