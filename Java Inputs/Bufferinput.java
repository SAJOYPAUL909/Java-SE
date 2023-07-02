import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Bufferinput
{
    public static void main(String args []) throws IOException
    {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(s); 
    }
}