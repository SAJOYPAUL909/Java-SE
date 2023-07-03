import java.util.Scanner;
public class IfElseIfCondition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter less than 10 for if statement\nenter 25 for if else statement\notherwise other input will result in else statement :");
        int x = sc.nextInt();
        if (x < 10)
        {
            System.out.println("x >10");
        }
        else if (x == 25)
        {
            System.out.println("x == 25");

        }
        else
        {
            System.out.println("Else Condition");
        }
        sc.close();

    }    
}
