package basic;

import java.util.Scanner;

public class DayCounting {

	private Object system;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days:");
		int days=sc.nextInt();
		
		int year=days/365;
		System.out.println("year: "+year);
		int remdays=days%365;
		
		int month=remdays/12;
		System.out.println("month: "+month);
		
		int day=remdays%12;
		System.out.println("days: "+day);
			
	}

}
