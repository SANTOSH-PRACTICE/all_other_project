package practis;

import java.util.Scanner;

public class alphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the charactor (a-z)&(A-Z)&number:");
		char ch = sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println(ch + "upper case alphabate");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println(ch + "lowercase alphabate" );
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println(ch + "digits" );
		}
		else
		{
			System.out.println("symbols");
		}
			


	}

}
