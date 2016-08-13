package reverse;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the total no of strings for reverse");
		int n=S.nextInt();
		System.out.println("Entr the String");
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=S.next();
		}
		System.out.println("The reversed Strings are ");
		for(int i=0;i<n;i++)
		{
			StringBuffer sb=new StringBuffer(s[i]);
			sb.reverse();
			System.out.println(sb);
		}
	}

}
