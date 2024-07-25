package practisDAY3;

import java.util.Scanner;

public class Daycounting {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of days:");
		int noOfDays =sc.nextInt();
		
         int year=  noOfDays/365;
         System.out.println(year+ "years");
         
         int remaingDays= noOfDays%365 ;
         int week= remaingDays/7;
         System.out.println(week+ "weeks");
         
         int day= remaingDays%7;
         System.out.println(day+ "days");
         
         
         
         
		
		



	}

}
