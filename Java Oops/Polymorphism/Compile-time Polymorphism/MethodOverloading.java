public class MethodOverloading 
{
    int a;
    int b;
    int c;
    float d;
    

     void sum (int a,int b)
     {
        System.out.println(a+b);
     }

     void sum (int a,int b ,int c)
     {
        System.out.println(a+b+c);
     }

     void sum (int a,float d)
     {
        System.out.println(a+d);
     }

     void sum (float d,int c)
     {
        System.out.println(d+c);
     }

    public static void main(String[] args) 
    {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(10,20);
        obj.sum(10,20,30);
        obj.sum(10.25f,20);
        obj.sum(26,83.84f);

    }    
}
