class Level1
{
void display()
{
    System.out.println("Level 1 class ");
}

}
class Level2 extends Level1
{
    void show()
    {
    System.out.println("Level 2 class ");
    }
}
class Level3 extends Level2
{
    void view()
    {
        System.out.println("Level 3 class");
    }
}

public class MulitLevelInheritance 
{
    public static void main(String[] args) 
    {
        Level3 obj = new Level3();
        obj.view();
        obj.show();
        obj.display();

    }
}
