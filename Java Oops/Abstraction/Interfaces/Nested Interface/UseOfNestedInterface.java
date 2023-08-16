public class UseOfNestedInterface 
{
    public interface NestedInterface
    {
        void show();
    }

    public static void main(String[] args) 
    {
        NestedInterface obj = new NestedInterface(){
         public void show ()
         {
            System.out.println("Nested Interface");
         }   
        };


        obj.show();
    }    
}
