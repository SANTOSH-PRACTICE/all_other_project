package day8class;

import java.util.Scanner;

public class numbercounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int rem,sum=0;
		while(num>0)
		{
			rem = num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		
		System.out.println("sum of digits:"+sum);
		
	}

}
