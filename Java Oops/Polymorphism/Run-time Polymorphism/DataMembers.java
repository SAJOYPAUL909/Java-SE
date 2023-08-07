class One
{
    int x = 10;
}

class Two extends One
{
    int x = 20;
}

public class DataMembers 
{
    public static void main(String[] args) 
    {
        One a = new Two();
        System.out.println(a.x);
    }    
}
