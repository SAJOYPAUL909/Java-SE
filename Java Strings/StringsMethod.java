public class StringsMethod 
{ 

    public static void main(String[] args) 
    {
        String s = "Sandeeppatel";
        String s1 = "Sand";
        String a = "Geeks";
        String a1 = "geeks";
        String b =  "  geeks  ";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.substring(4));
        System.out.println(s.substring(3, 5));
        System.out.println(s.concat(s1));
        System.out.println(s.indexOf("d"));
        System.out.println(s.indexOf("s",4));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.equals(s1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a.compareTo(a1));
        System.out.println(a.compareToIgnoreCase(a1));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(b.trim());
        System.out.println(a1.replace("g","k"));
        

        
    }    

    
}
