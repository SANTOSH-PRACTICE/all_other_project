package number;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int copynum=num;
		int sum=0;
		
		while(copynum>0)
		{
			int y=copynum%10;
		sum=sum+y;
		copynum=copynum/10;
		}

		if(num%sum==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not harshad number:");
		}
	}

}
