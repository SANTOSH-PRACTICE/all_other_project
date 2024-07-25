package day3badsicproram;

import java.util.Scanner;

public class Practis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number1:");
		int number1=sc.nextInt();
		
		
		System.out.println("enter number2:");
		int number2= sc.nextInt();
		
		
		System.out.println("enter number3:");
		int number3=sc.nextInt();
		
		if ((number1>number2)  && (number1>number3))
		{
			System.out.println(number1 +" is greater");
		}
		
		else if((number2>number1)  && (number2>number3))
		
		{
			System.out.println(number2 +" is greater");
		}
		
		else
		{
			System.out.println(number3 +" is greater");
		}
			
		

		

	}

}
