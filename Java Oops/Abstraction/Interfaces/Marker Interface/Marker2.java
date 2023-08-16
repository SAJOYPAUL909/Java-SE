import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class One implements Serializable
{
    int i ;
    String s;

    One(int i , String s)
    {
        this.s = s;
        this.i = i;
    }
}

public class Marker2 
{
    public static void main(String[] args) throws IOException ,ClassNotFoundException
    {
        One a = new One(23, "Sandeep");

        System.out.println("Serializing");
        FileOutputStream f = new FileOutputStream("xyz.txt");
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.writeObject(a);

        System.out.println("De-Serializing");
        FileInputStream fd = new FileInputStream("xyz.txt");
        ObjectInputStream obj2 = new ObjectInputStream(fd);

        One b =  (One)obj2.readObject();

        System.out.println( b.s +" "+b.i);


        obj.close();
        obj2.close();


    }    
}
