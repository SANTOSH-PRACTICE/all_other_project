package basicprogram;

import java.util.Scanner;

public class weekdayswich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int day;
		System.out.println("Enter the number between 1-7:");
		day=sc.nextInt();
		switch(day)
		{
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wendesday");
		break;
		case 4: System.out.println("Thrusday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saterday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("invalid choice");
		}

		


		

		

		

		

		
}
}