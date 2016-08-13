import java.util.*;
class reverseno
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the total no count for reverse");
		int n=S.nextInt();
		System.out.println("Entr the Number");
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=S.next();
		}
		System.out.println("The reversed numbers are ");
		for(int i=0;i<n;i++)
		{
			StringBuffer sb=new StringBuffer(s[i]);
			sb.reverse();
			System.out.println(sb);
		}
	}	
}
