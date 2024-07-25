package day6class;

import java.util.Scanner;

public class yearleaf {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter year is:");
		int year = sc.nextInt();
		
		if((year % 4 ==0)&& (year % 100 !=0 ))
				{
			System.out.println(year+ " leaf year");
				}
		else if (year %400 ==0  )
		{
			System.out.println(year+ "leaf year");
		}
		
		else {
			
			System.out.println("not a leaf year");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
	

}
