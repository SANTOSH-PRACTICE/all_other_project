package basic;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		
		if(year%4==0&&year%100!=0)
		{
			System.out.println("leaf year");
		}
		else if(year%400==0)
		{
			System.out.println("leafyear");
		}
		else
		{
			System.out.println("Not leaf year");
		}
		
		
	}

}
