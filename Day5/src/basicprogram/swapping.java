package basicprogram;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1,number2;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number1:");
		number1 =sc.nextInt();
		System.out.println("Enter number2:");
		number2 =sc.nextInt();

		System.out.println("before swapping  valve of number1 is:" +number1);
		System.out.println("before swapping  valve of number2 is:" +number2);
		
		number1= number1+number2;
		number2= number1-number2;
		number1=number1-number2;
		
		
		System.out.println("after swapping  valve of number1 is:" +number1);
		System.out.println("after1 swapping  valve of number2 is:" +number2);
		

		
		
		


		
		

	}

}
