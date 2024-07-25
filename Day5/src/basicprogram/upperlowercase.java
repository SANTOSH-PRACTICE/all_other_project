package basicprogram;

import java.util.Scanner;

public class upperlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.println("enter a charactor value:");
		ch =sc.next().charAt(0);
		
		if(ch>= 'A'&& ch<= 'Z')
		{
			System.out.println(ch+  "is an uppercase Aplhabet");
		}
		
		else if(ch>= 'a'&& ch<= 'z')
		{
			System.out.println(ch+  " is a lowecase");
		}
			
			else
			{
				System.out.println(ch+  " is a not alphabet");

			}
		

	}

}
