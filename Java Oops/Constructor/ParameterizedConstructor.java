class ParameterizedConstructor
{
    String name ;
    int id;
    public ParameterizedConstructor(String name,int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) 
    {
        ParameterizedConstructor obj = new ParameterizedConstructor("Abhinash", 102);
        System.out.println(" name : "+obj.name+" id : "+obj.id);
        
    }
}