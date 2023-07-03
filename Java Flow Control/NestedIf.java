import java.util.Scanner;
public class NestedIf 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("IF smaller than 20 :\n than two condition smaller than 15 or smaller than 12 \nelse part when x is greater than 20\nbetween 15 to 20 no return");
         int i = sc.nextInt();
        
        if (i < 20 ) 
        {
            
            if (i < 15)
                System.out.println("less than 15");

            if (i < 12)
                System.out.println("less than 12");
        }   
        else
        {
                System.out.println("greater than 20");
        }
       
        sc.close();
    }
    
}
