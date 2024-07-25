package day3badsicproram;

import java.util.Scanner;

public class DAYCOUNTING {

	public static void main(String[] args) {
		
		Object system;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of days:");
		int noOfDays =sc.nextInt();
		
		
		int year = noOfDays/365;
		System.out.println(year+" years");
		
		int remaingDays = noOfDays%365;
		int week=remaingDays/7;
		System.out.println(week+" week");
		
		remaingDays= remaingDays%7;
		System.out.println(remaingDays+"days");


		
		
		

		

	
		

	}

}
