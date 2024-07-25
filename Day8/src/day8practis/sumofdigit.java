package day8practis;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the valve:");
		int num=sc.nextInt();
		
		int rem;
		int sum=0;
		while(num>0)
			
		{
			rem=num%10;
			sum=sum + rem;
			num= num/10;
			
					
				
		}

		System.out.println("sum of digit:"+sum);
	}

}
