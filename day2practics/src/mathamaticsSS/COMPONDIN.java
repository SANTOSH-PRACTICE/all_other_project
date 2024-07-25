package mathamaticsSS;

import java.util.Scanner;

public class COMPONDIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount:");
		double principle=sc.nextDouble();
		
		System.out.println("enter the rate :");
		float rate=sc.nextFloat();
		
		System.out.println("enter the time :");
		float time=sc.nextFloat();
		System.out.println("enter the n :");
		int n=sc.nextInt();
		
		double amount=principle*(Math.pow(1+(rate/n),(n*time)));
		System.out.println("amount:"+amount);
		
		double ci=amount-principle;
		System.out.println("amount:"+ci);





	}

}
