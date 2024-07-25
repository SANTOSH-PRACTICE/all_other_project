package basicprogram;

import java.util.Scanner;

public class spcialsym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter charactor between range (a-z) or(A-Z)");
		char ch = sc.next().charAt(0);
		
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		{
			System.out.println(ch+   "is an alphabet");
			
		}
		else if (ch>='0'&& ch<='9')
		{
			System.out.println(ch+   "is a digit");
		}
		
		else
		{
			System.out.println(ch+  "is a special charactor");
		}
		


	}

}
