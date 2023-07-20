public class CurrentClassMethod 
{
    void display()
    {
        this.show();
        System.out.println("Display function called");
    }

    void show()
    {
        System.out.println("Show function invoked by display function by 'this' keyword");
    }
    public static void main(String[] args) 
    {
        CurrentClassMethod obj = new CurrentClassMethod();
        obj.display();
    }    
}
