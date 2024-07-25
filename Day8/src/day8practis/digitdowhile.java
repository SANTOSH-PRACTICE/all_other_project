package day8practis;

import java.util.Scanner;

public class digitdowhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the valve:");
		int num=sc.nextInt();
		int rem;
		int sum=0;
	do	{
			rem=num%10;
			sum=sum + rem;
			num= num/10;
	     }
	
		while(num>0);
		System.out.println("sum of digit:"+sum);
	}
}
