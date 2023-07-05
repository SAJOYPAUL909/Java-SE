public class NestedDoWhileLoop 
{
    public static void main(String[] args) 
    {
        int i = 1,j= 1,x;

        do 
        {
            x = 4;
            do
            {
                System.out.print(i+"\n");
                x--;
            }while(x >=i);
            j =1;
            do 
            {
                System.out.print(j+" ");
                j++;
            }while(j<=5);
        System.out.println(" ");
        i++;
        }while(i<=5);
    }
    
}
