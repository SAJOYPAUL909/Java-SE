abstract class Creature 
{
    abstract void No_of_Legs();
}

class Elephant extends Creature
{
    public void No_of_Legs()
    {
        System.out.println("Elephant has 4 legs");
    }
}

class Human extends Creature
{
    public void No_of_Legs()
    {
        System.out.println("Human has 2 legs");
    }
}

public class AbstractionInJava 
{
    public static void main(String[] args) 
    {
         Human h = new Human();
         h.No_of_Legs();
         
         Elephant e = new Elephant();
         e.No_of_Legs();
    }    
}
