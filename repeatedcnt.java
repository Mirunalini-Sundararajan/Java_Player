package repeatedcnt;

import java.util.Arrays;
import java.util.Scanner;

public class repeatedcnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the count of the String");
		int n=S.nextInt();
		System.out.println("Enter the String");
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
		s[i]=S.nextLine();
		}
		int c=0;
		int d[]=new int[s.length];
		for(int i=0;i<n;i++)
		{
			char ss[]=s[i].toCharArray();
			c=0;
			for(int k=0;k<s[i].length();k++)
			{
				for(int j=i+1;j<s[i].length();j++)
				{
					if(ss[i]==ss[j])
					{
						d[i]=c++;
					}
					else
						break;
				}
			}
		}
		Arrays.sort(d);
		System.out.println(d[d.length-1]);
		for(int i=0;i<n;i++)
		{
			if(d[i]==d[d.length-1])
			{
				System.out.println(s[i]);
			}
			
		}
	}

}
