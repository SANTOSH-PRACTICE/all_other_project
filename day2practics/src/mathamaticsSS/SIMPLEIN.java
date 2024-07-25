package mathamaticsSS;

import java.util.Scanner;

public class SIMPLEIN {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount:");
		double principle=sc.nextDouble();
		
		System.out.println("enter the rate :");
		float rate=sc.nextFloat();
		
		System.out.println("enter the time :");
		float time=sc.nextFloat();
		double amount=principle*(1+(rate*time));
		System.out.println("amount:"+amount);
		double si=amount-principle;
		System.out.println("amount:"+si);




	}

}
