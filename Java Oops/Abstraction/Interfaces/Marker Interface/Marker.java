class A implements Cloneable
{
    int i;
    String s;

    A(int i , String s)
    {
        this.i = i;
        this.s = s;
    }

    @Override 
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}


public class Marker 
{
    public static void main(String[] args)  throws CloneNotSupportedException
    {
        A a = new A(21, "Sandeep");

        A b = (A)a.clone();
        System.out.println("Name : "+b.s);
        System.out.println("Age : "+b.i);

    }    
}
