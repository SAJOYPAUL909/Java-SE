import java.text.DecimalFormat;
public class Decimalfomat
{
    public static void main(String[] args) 
    {
     double  a = 45.3876 ;

     DecimalFormat d = new DecimalFormat("####");
     System.out.println("Only numeric value :"+d.format(a));
 
     d = new DecimalFormat("#.##");
     System.out.println("upto two decimal value :"+d.format(a));


     d = new DecimalFormat("#.0000000");
     System.out.println("upto seven  decimal value :"+d.format(a));

    d = new DecimalFormat("0000.0000");
     System.out.println("upto four places before decimal value :"+d.format(a));

     double k = 2341.3768;
     d = new DecimalFormat("$##,###.##");
     System.out.println("upto seven  decimal value :"+d.format(k));
    }   
}
