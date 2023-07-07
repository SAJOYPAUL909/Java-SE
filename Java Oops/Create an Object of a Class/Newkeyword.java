public class Newkeyword 
{
    void output()
    {
        System.out.println("called function by object");
    }
    public static void main(String[] args) 
    {
        //classreference object_name = new (for instantiating new obj) calling constructor for object creation
        Newkeyword obj = new Newkeyword();
        obj.output();
    }
}
