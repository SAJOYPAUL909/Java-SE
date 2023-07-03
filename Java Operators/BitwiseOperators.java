public class BitwiseOperators 
{
    public static void main(String[] args) 
    {
        int a = 0b1100;
        int b = 0b0101;
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("a&b :"+(a&b));
        System.out.println("a|b :"+(a|b));
        System.out.println("a^b :"+(a^b));
        System.out.println("a :"+(~a));
        System.out.println("a>>2"+(a>>2));
        System.out.println("a<<2"+(a<<2));
        System.out.println("a>>>2"+(a>>>2));
        
    }
}
