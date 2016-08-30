import java.util.*;
class player43
{
	public static void main(String []args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=S.next();
		System.out.println("Enter the Substring");
		String s2=S.next();
		if(s1.toLowerCase().contains(s2.toLowerCase()))
		{
			System.out.println(s2+" is the substring of "+ s1);
		}
		else
		{
			System.out.println(s2+" is not the substring of "+s1);
		}
	}	
}
