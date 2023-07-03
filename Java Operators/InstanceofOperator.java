public class InstanceofOperator 
{
    public static void main(String[] args) 
    {
        people obj1 = new people();
        tera obj2 = new tera();

        System.out.println("(obj1 instanceof people) :"+(obj1 instanceof people));
        System.out.println("(obj1 instanceof people) :"+(obj1 instanceof tera));
        System.out.println("(obj1 instanceof hello) :"+(obj1 instanceof hello));

        System.out.println("(obj2 instanceof people) :"+(obj2 instanceof people));
        System.out.println("(obj2 instanceof people) :"+(obj2 instanceof tera));
        System.out.println("(obj2 instanceof hello) :"+(obj2 instanceof hello));

        
    }    


}
class people
{

}
class tera extends people implements hello
{

}
interface hello
{

}