package basicprogram;

import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int day;
		System.out.println("Enter the number between 1-7:");
		day=sc.nextInt();
		if(day==1)
		{
			System.out.println("Monday");
		}
		
		
		else if(day==2)
		{
			System.out.println("Tuesday");
		}

		else if(day==3)
		{
			System.out.println("Wednesday");
		}
		
		else if(day==4)
		{
			System.out.println("Thursday");
		}
		
		else if(day==5)
		{
			System.out.println("Friday");
		}
		
		else if(day==6)
		{
			System.out.println("Saterday");
		}
		
		else if(day==7)
		{
			System.out.println("Sunday");
		}
		
		else 
		{
			System.out.println("Plese enter number between 1-7");  
		}
		





		
	}
   
}
