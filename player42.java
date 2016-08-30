import java.util.*;
class player42
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the count of the array");
		int n=S.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[i])
			{
				c++;
			}
		}
		if(c==n)
		{
			System.out.println("Sorted order");
		}
		else
		{
			System.out.println("Not in sorted order");
		}		
		
	}
}