package practisDAY3;

import java.util.Scanner;

public class Greater3no {

	public static void main(String[] args) {
		
		

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
