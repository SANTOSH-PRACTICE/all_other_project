package practisDAY3;

import java.util.Scanner;

public class GREATER3nocomp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the valve of number1:");
		int number1=sc.nextInt();
		
		System.out.println("Enter the valve of number2:");
		int number2=sc.nextInt();
		
		System.out.println("Enter the valve of number:");
		int number3=sc.nextInt();
		
		if((number1>number2)&&(number1>number3))
				

		{
	
				System.out.println("number1 is greater valve " +number1);
		     
		 }   
		

		else if((number2>number1)&&(number2>number3))
		{
			System.out.println("number2 is greater valve"+number2);
		}
		else
		{
			System.out.println("number3 is greater valve" +number3);
		}

		}

	}




