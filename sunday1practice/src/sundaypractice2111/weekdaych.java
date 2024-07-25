package sundaypractice2111;

import java.util.Scanner;

public class weekdaych {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		char day = sc.next().charAt(0);
		
		switch(day)
		{
		case 'a' : System.out.println("monday");
		        break;
		       
		case 'b': System.out.println("tuesday");
        break;
        
		case 'c' : System.out.println("wendesday");
        break;
        
		case 'd' : System.out.println("thirseday");
        break;
        
		case'e' : System.out.println("friday");
        break;
        
		case 'f' : System.out.println("saterday");
        break;
		case 'g' : System.out.println("sunday");
        break;
        
        default : System.out.println("plese enter( a- g)");
		}

	}

}
