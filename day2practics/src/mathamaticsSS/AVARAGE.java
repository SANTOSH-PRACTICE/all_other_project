package mathamaticsSS;

import java.util.Scanner;

public class AVARAGE {

	public static void main(String[] args) {
		
	

	
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the marks marathi :");
			int marathi=sc.nextInt();
			
			System.out.println("enter the marks hindi :");
			int hindi=sc.nextInt();
			
			System.out.println("enter the marks english:");
			int english=sc.nextInt();
			
			System.out.println("enter the marks sanskrit :");
			int sanskrit=sc.nextInt();
			
			System.out.println("enter the marks science :");
			int science=sc.nextInt();
			
			double totalMarks=(marathi+hindi+english+sanskrit+science);
			System.out.println("total marks :"+totalMarks);
			
			double avrage=(totalMarks)/5;
			System.out.println("avarage marks :"+avrage);

			

					
			



			

			
			
		
			
			
					


	}

}
