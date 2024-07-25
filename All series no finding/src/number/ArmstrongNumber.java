package number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int sum=0;
		int num1=num;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		if(sum==num1)
		{
			System.out.println("ArmstrongNumber number");
			
		}
		else
		{
			System.out.println("not  armstrong number");
		}
	}

}
