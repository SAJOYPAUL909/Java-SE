import java.util.Scanner;

public class IfElseCondition 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number greater than 15 for if or else block will execute :");
        int x = sc.nextInt();

        if (x > 15)
        {
            System.out.println("Inside  IF Block");
        }
        else
        {
            System.out.println("Else Block");
        }
        sc.close();
    }
}
