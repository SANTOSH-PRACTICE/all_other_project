package number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int fact=1;
		
		do
		{
			fact=num*fact;
			num--;
		}
		while(num!=0);
		
		System.out.println("factorial:"+fact);

	}

}
