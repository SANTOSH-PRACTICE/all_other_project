package test11st;

import java.util.Scanner;

public class q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the total no of days:");
		int totalDays= sc.nextInt();
		
		int year= totalDays/365;
		System.out.println(year+"years");
		
		int remaingDays=totalDays%365;
		int week= remaingDays/7;
		System.out.println(week+"weeks");
		
		int day=remaingDays%7;
		System.out.println(day+"days");
		
		
		

	}

}
