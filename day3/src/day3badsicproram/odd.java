package day3badsicproram;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number= sc.nextInt();
		if(number%2 !=0)
		{
			System.out.println( "the given number "+number+" is odd ");
		}


	}

}
