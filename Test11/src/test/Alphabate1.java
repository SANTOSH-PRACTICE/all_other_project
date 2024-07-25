package test;

import java.util.Scanner;

public class Alphabate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charactor: ");
		char ch=sc.next().charAt(0);
		
		if((ch>='a'&&ch<= 'z')||(ch>='A'&&ch<='Z'))
        {
	   System.out.println("alphabate");
        }
		
		else if((ch>='1'&&ch<='9'))
		{
			   System.out.println("Digit");

		}
		else
		{
			System.out.println("Spesial symbol");
		}

	}

}
