public class ForEachLoop 
{
    public static void main(String args [])
	{
        int arr[] = {19,28,37};
		int count = 0,sum = 0;
		for(int x : arr)
		{	
			count += 1;
			sum = sum + x;
		}		
	System.out.println("No. of element "+count);
	System.out.println("Sum of element "+sum);	
	}
    
}
