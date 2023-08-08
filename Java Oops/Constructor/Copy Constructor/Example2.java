class Complex
{
         private double a , b ;
         public Complex (double a, double b)
         {
            this.a = a;
            this.b = b;
         }

         Complex(Complex c)
         {
            System.out.println("Copy constructor");
            a = c.a;
            b = c.b;
         }

         public String toString()
         {
            return "a : "+a + "\n b : "+b;
         }
}

public class Example2 
{
    public static void main(String[] args) 
    {
        Complex com = new Complex(10,20);
        Complex com1 = new Complex(com);
        Complex com2 = com1;

        System.out.println(com2);

    }    
}
