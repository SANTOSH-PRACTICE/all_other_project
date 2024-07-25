package classp;

import java.util.Scanner;

public class incridecri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("Enter valve of number1:");
		number1=sc.nextInt();
		
		System.out.println("Enter valve of number2:");
		number2=sc.nextInt();

		
		System.out.println("Enter valve of number3:");
		number3=sc.nextInt();
		
		if (number1<number2 && number2 < number3)
		{
			System.out.println("All number in incresing order");
		}
		
		else if (number1>number2 && number2 > number3)
		{
			System.out.println("All number in decresing  order");
		}
		
		else 
		{
			System.out.println("Neither incresing nor decrising");
		}
		
		

	}

}
