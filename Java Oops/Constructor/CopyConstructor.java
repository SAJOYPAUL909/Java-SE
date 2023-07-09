public class CopyConstructor 
{

    int x;
    float y;
    public CopyConstructor(int x,float y)
    {
        this.x = x;
        this.y = y;
    }

    CopyConstructor( CopyConstructor cc)
{
    this.x = cc.x;
    this.y = cc.y;

}

    public static void main(String[] args) 
    {
          CopyConstructor obj = new CopyConstructor(1234, 13.23f);
          CopyConstructor obj1 = new CopyConstructor(obj);      
          System.out.println(" "+obj.x+" "+obj.y);
          System.out.println(" "+obj1.x+" "+obj1.y);

    }
}
