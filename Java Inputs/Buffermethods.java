import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Buffermethods 
{
    public static void main(String[] args)  throws IOException
    { 
        FileReader fr = new FileReader("reading.txt");
        BufferedReader bf = new BufferedReader(fr);

        char c[] = new char[25];

        if (bf.markSupported())
        {
            System.out.println("Mark method suported");
            bf.mark(100);
        }
        
        bf.skip(13);

        if (bf.ready())
        {
            System.out.println(bf.readLine());
            bf.read(c);
            for (int i = 0; i<25 ;i++)
            System.out.print(c[i]);
        }
        bf.reset();
        for (int i= 0;i<12 ;i++)
        {System.out.print((char)bf.read());}
        bf.close();

    }
}
