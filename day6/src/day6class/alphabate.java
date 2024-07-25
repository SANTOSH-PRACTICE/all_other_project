package day6class;

import java.util.Scanner;

public class alphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a charactor:");
		char ch =sc.next().charAt(0);
		
		if((ch>=65)&&(ch<=90)) 
		{
			System.out.println(" Entered charactor is an uppercase Alphabate");
			
		}
		
		else if ((ch>=97)&&(ch<=122))
		{
			System.out.println(" Entered charactor is an lowercase Alphabate");

		}
		
		else if ((ch>= 48)&&(ch<=57))
		{
			System.out.println(" Entered charactor is  a Digit");

		}
		
		else
		{
			System.out.println(" Entered charactor is a symbol");

		}
		

	}

}
