package number;

import java.util.Scanner;

public class PellidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		int y=0;
		int temp=num;
		
		while(num>0)
		{
			y=num%10;
			sum=(sum*10)+y;
			num=num/10;
		}
		if(temp==sum)
		{
		System.out.println("pelidrom number");
		}
		else
		{
			System.out.println("not pellidrom number");
		}
		

	}

}
