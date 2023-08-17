import java.util.*;

class Students
{
    int Roll_No;
    String Address,Name;

    public Students(int Roll_No , String Name , String Address )
    {
        this.Roll_No = Roll_No;
        this.Name = Name;
        this.Address = Address;
    }

    public String toString()
    {
        return "Roll No : "+this.Roll_No +" Name : "+this.Name +" Address : "+this.Address;
    }
}

class SortByRoll_No implements Comparator <Students>
{
    public int compare(Students a ,Students b )
    {
        return a.Roll_No - b.Roll_No;
    }
}

class SortByName implements Comparator <Students>
{
    public int compare(Students a ,Students b )
    {
        return a.Name.compareTo(b.Name);
    }
}


public class ComparatorInterface 
{
    public static void main(String[] args) 
    {
        ArrayList<Students> ar = new ArrayList<>();

        ar.add(new Students(111, "Mayank", "london"));
        ar.add(new Students(131, "Anshul", "nyc"));
        ar.add(new Students(121, "Solanki", "jaipur"));
        ar.add(new Students(101, "Aggarwal", "Hongkong"));

        System.out.println("Unsorted");

        for (int i = 0 ; i < ar.size();i++)
        {
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new SortByRoll_No());
        System.out.println("Sort by Roll no");
        for (int i = 0 ; i < ar.size();i++)
        {
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new SortByName());
        System.out.println("Sort by Name");
        for (int i = 0 ; i < ar.size();i++)
        {
            System.out.println(ar.get(i));
        }


    }        
}
