package sundaypractice2111;

import java.util.Scanner;

public class Leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the your choise year:");
		int year= sc.nextInt();
		
		if((year %4 ==0)&&(year%100 != 0))
		{
			System.out.println(year + " is leaf year");
		}
		
		else	if (year %400 ==0)
		{
			System.out.println(year + " is leaf year");
		}
		
		else 
		{  
			System.out.println("not leaf year");
		}
		
		

	}

}
