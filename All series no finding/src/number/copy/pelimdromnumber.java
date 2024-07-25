package number.copy;

import java.util.Scanner;

public class pelimdromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =sc.nextInt();
		int temp=number;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
			
		
		}
		if(temp==sum)
		{
			System.out.println("the number is pellidrom:");
		}
		else
		{
			System.out.println("the number is not pellidrom:");

		}
		
	}

}
