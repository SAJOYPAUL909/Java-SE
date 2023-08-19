public class SubsetOfCharArray 
{
    public static void main(String[] args) 
    {
        byte ascii[] ={83,65, 78 ,68 ,69,69,80} ;
        String one = new String(ascii);
        System.out.println(one);

        String two = new String(ascii,0,4);
        System.out.println(two);

    }    
}
