package practiceday6;

import java.util.Scanner;

public class Leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter of year");
		year = sc.nextInt();
		
		if((year%4 == 0)&&(year%100 !=0))
		{
           System.out.println("is leaf year"); 
		}
		else if(year%400 ==0)
		{
	           System.out.println("is leaf year"); 

		}
		else
		{
	           System.out.println("is not leaf year"); 

		}
	}

}
