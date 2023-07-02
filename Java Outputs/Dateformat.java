import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dateformat

{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        String k = s.format(new Date());
        System.out.println(k);

        String m = "2000/05/26";
        s = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(s.parse(m));
    }    
}
