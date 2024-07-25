package test11st;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the no of total days:");
		int totalDays=sc.nextInt();
		
		int year= totalDays/365;
		System.out.println("year" +year);
		
		int remaingday= totalDays%365;
		
		int week=remaingday/7;
		System.out.println("weeks"+ week);
		
		int days=remaingday%7;
		System.out.println("days"+days);

		

		
		

		
	
		
		
		
			



	}

}
