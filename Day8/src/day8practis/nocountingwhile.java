package day8practis;

import java.util.Scanner;

public class nocountingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num =sc.nextInt();
		
		int sum=0,rem;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
       System.out.println("sum of digit is:" +sum);
	}

}
