class Singleton
{
    int x = 10;

    static Singleton instance = null;


    private Singleton()
    {
        System.out.println("Private constructor");
    }

    static public Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }


}


public class SingletonClass 
{
    public static void main(String[] args) 
    {
        Singleton a = Singleton.getInstance();
        System.out.println(a.x);
        
        Singleton b = Singleton.getInstance();
        System.out.println(b.x);
    }    
}
