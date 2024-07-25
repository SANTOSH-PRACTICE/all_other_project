package day8class;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int num =sc.nextInt();
		int fact =1;
		while(num>0)
		{
			fact=num*fact;
					num--;
		}
		System.out.println("factorial of given number ids :"+fact);
	}

}
