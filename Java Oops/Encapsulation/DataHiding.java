class Bank
{
    private long CurentBal = 0;
    long Bank_id;
    String Name;

    public long get_Bal(long ID)
    {
        if (this.Bank_id == ID)
            return CurentBal;
        return -1;
    }

    public void set_Bal(long balance , long ID)
    {
        if (this.Bank_id == ID)
        {
            CurentBal += balance; 
        }
    }
}


class DataHiding
{
    public static void main (String args [])
    {
        Bank b = new Bank();
        b.Name = "Sandeep";
        b.Bank_id = 719;
        b.set_Bal( 2786, 719);

        System.out.println("User-Name = "+b.Name + "\nBank ID = "+b.Bank_id +"\nCurrent Balance = "+ b.get_Bal(719));

    }
}