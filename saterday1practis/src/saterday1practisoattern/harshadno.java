package saterday1practisoattern;

import java.util.Scanner;

public class harshadno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no your choice:");
		int num=sc.nextInt();
		int numcopy=num;
		int y=0;
		int sum =0;
		while(numcopy>0)
			{
			y=numcopy%10;
			sum=sum+y;
			numcopy=numcopy/10;
			y++;
		}
		if(num%sum==0)
		{
			System.out.println("harshad no");
		}
		else 
			
		{
			System.out.println("no harshad no");
		}

	}

}
