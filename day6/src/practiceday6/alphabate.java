package practiceday6;

import java.util.Scanner;

public class alphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		 
		System.out.println("Enter charactor :");
		char ch= sc.next().charAt(0);
		
		if((ch>=65)&&(ch<=90))
		{
		System.out.println("the letter is uppercase alphabate");
		
		}
		else if ((ch>=97)&&(ch<=122))
		{
			System.out.println("the letter is lowercase alphabate");

		}
		else if ((ch>=48)&&(ch<=57))
		{
			System.out.println(" the valve is digit");
	    }
		

		else
		{
			System.out.println(" the symbols");

		}
	}

}

