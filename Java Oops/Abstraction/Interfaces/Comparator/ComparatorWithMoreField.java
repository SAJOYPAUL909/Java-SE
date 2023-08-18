import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student
{
    String  Name;
    int Age;

    public Student(String Name , Integer Age)
    {
        this.Name = Name;
        this.Age = Age;

    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setAge (Integer Age)
    {
        this.Age = Age;
    }

    public String getName()
    {
        return Name;
    }

    public Integer getAge()
    {
        return Age;
    }

    @Override 
    public String toString()
    {
        return "Name : "+Name+ " Age : "+Age;
    }

}

class CostumorSorting implements Comparator<Student>
{

    public int compare (Student customer1 ,Student customer2)
    {
        int NameCompare = customer1.getName().compareTo(customer2.getName());
        int AgeCompare = customer1.getAge().compareTo(customer2.getAge());
        return (NameCompare == 0) ? AgeCompare : NameCompare ;
    }
}

public class ComparatorWithMoreField 
{
    public static void main(String[] args) 
    {
        List<Student> a = new ArrayList<>();

        Student obj1 = new Student("Aman", 27);
        Student obj2 = new Student("Sandeep", 23);
        Student obj3 = new Student("Yash", 37);
        Student obj4 = new Student("Vikas", 22);
        Student obj5 = new Student("Prince", 29);
        Student obj6 = new Student("Satendra", 22);

        a.add(obj1);
        a.add(obj2);
        a.add(obj3);
        a.add(obj4);
        a.add(obj5);
        a.add(obj6);

        Iterator<Student> iterate = a.iterator();

        System.out.println("Before Sorting ::");
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

        Collections.sort(a , new CostumorSorting());

        System.out.println("After Sorting :: ");
        
        for (Student cus :a)
        {
            System.out.println(cus);
        }

 
    }    
}
