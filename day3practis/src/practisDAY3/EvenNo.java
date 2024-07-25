package practisDAY3;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args)  
	
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number= sc.nextInt();
		if(number%2==0)
		{
			System.out.println( "the given number "+number+"  is even number");
		}


	}

}
