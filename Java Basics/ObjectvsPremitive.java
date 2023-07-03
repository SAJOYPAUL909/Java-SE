import java.util.Arrays;

public class ObjectvsPremitive 
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = x;
        System.out.println("initially");
        System.out.println("X = "+x+"\tY = "+y);
        y = 30;
        System.out.println("after change");
        System.out.println("X = "+x+"\tY = "+y);


        int c[] = {10,20,30,40,50};
        int d[] = c;

         System.out.println("intially : c :"+Arrays.toString(c)+"\nd : "+Arrays.toString(d));
        d[1] = 35;


        System.out.println("after change : c :"+Arrays.toString(c)+"\nd : "+Arrays.toString(d));

    }   
}
