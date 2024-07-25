package practisDAY3;

import java.util.Scanner;

public class Daycountingpractis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of day: ");
		int noOfDay=sc.nextInt();
		 
		int year=noOfDay/365;
		System.out.println(year+ "years");
		int remaingday= noOfDay%365;
		
		int week=remaingday/7;
		System.out.println(week+"weeks");
		
		int day= remaingday%7;
		System.out.println(day+ " days");
		
		
		
		

	}

}
