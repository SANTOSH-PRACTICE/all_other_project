package basic;

import java.util.Scanner;

public class twoNumberSwapping {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
			System.out.println("Before swapping: "+" num1: "+num1  +" num2 :"+num2 );
			
		num2=num1+num2;
		num1=num2-num1;
		num2=num2-num1;

		System.out.println("after swapping: "+" num1: "+num1  +" num2: "+num2 );

		
	}

}
