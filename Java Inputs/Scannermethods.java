import java.util.Scanner;
public class Scannermethods
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String s = sc.next();
        System.out.println("Enter age :");
        int i = sc.nextInt();
        System.out.println("Enter Mo. number : ");
        long l = sc.nextLong();
        System.out.println("Enter  Cgpa :");
        double d = sc.nextDouble();
        System.out.println("Enter boolean :");
        boolean b = sc.nextBoolean();

        System.out.println("Name : "+s);
        System.out.println("age :"+i);
        System.out.println("Mo. number : "+l);
        System.out.println("Cgpa :"+d);
        System.out.println("boolean :"+b);
        sc.close();
    }
}
