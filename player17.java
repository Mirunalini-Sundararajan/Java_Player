import java.util.*;
class player17
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the 11 digit number");
		String n=S.next();
		char a[]=n.toCharArray();//25525511135
		char b[]=new char[n.length()+5];
		int j=0;
		for(int i=0;i<n.length();i++)
		{
			if(i%3==0 && i!=0)
			{
				b[j]='.';
				j++;
			}
			b[j]=a[i];
			j++;

		}	
		for(int i=0;i<n.length()+3;i++)
		{
			System.out.print(b[i]);
		}	
		
	}
}