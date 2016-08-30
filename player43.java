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
			System.out.println("It contains the substring");
		}
		else
		{
			System.out.println("It does not contains the substring");
		}
	}	
}