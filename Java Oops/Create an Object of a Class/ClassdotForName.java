import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassdotForName 
{
    void output ()
    {
        System.out.println("calling function from obj");
    }
    public static void main(String[] args) 
    {

        //Test obj = (Test)Class.forName("com.p1.Test").newInstance();
        //newInstance() method is deprecated from Java 9  therfore using forcefully by a constructor
    try {
    Class<?> obj = Class.forName("ClassdotForName");
    ClassdotForName instance = (ClassdotForName) obj.getDeclaredConstructor().newInstance();
    Method method = obj.getDeclaredMethod("output");
    String output = (String) method.invoke(instance);
    System.out.println(output.toString());
      //  instance.output(); instance is object name
} catch (InstantiationException e) {
    // Handle InstantiationException here
} catch (IllegalAccessException e) {
    // Handle IllegalAccessException here
} catch (InvocationTargetException e) {
    // Handle InvocationTargetException here
} catch (ClassNotFoundException e) {
    // Handle ClassNotFoundException here
} catch (Exception e) {
    // Handle any other exceptions here
}




    }    
}
