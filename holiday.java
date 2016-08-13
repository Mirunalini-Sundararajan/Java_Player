package holiday;

import java.util.Scanner;

public class holiday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the day");
		String s=S.next();
		if(s.equalsIgnoreCase("Monday")||s.equalsIgnoreCase("Tuesday")||s.equalsIgnoreCase("Wednesday")||s.equalsIgnoreCase("Thursday")||s.equalsIgnoreCase("Friday")||s.equalsIgnoreCase("Saturday"))
				{
			System.out.println("True");
				}
		else if(s.equalsIgnoreCase("Sunday"))
		{
			System.out.println("False");
		}
	}

}
