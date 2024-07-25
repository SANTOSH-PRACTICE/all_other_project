package sundaypractice2111;

import java.util.Scanner;

public class WEEKday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1 : System.out.println("monday");
		        break;
		       
		case 2 : System.out.println("tuesday");
        break;
        
		case 3 : System.out.println("wendesday");
        break;
        
		case 4 : System.out.println("thirseday");
        break;
        
		case 5 : System.out.println("friday");
        break;
        
		case 6 : System.out.println("saterday");
        break;
		case 7 : System.out.println("sunday");
        break;
        
        default : System.out.println("plese enter 1- 7");
		}
		
		
		
		
		
		
		

	}

}
