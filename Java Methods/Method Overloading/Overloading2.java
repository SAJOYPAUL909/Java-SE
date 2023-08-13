class Product
{
    public int multiply(int a ,int b , int c)
    {
        return a*b*c;
    }

    public double multiply(double a ,double b , double c)
    {
        return a*b*c;
    }
}
public class Overloading2 
{
    public static void main(String[] args) 
    {
        Product a = new Product();

        int pro1 = a.multiply(5, 2, 3);
        double pro2 = a.multiply(25, 90, 7);

        System.out.println("Product of three Interger : "+pro1);
        System.out.println("Product of three Double : "+pro2);
    }    
}
