package day2;

import java.util.Scanner;

public class ci {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the priciple amount:");
		double principle = sc.nextDouble();
		

		System.out.println("Enter rate of interest:");
		double rate = sc.nextDouble();

		System.out.println("Enter time:");
		float time = sc.nextFloat();
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		double amount= principle*(Math.pow((1+(rate/n)),(n*time )));
		System.out.println(" amount:"+amount);
		
		double ci= amount- principle;
		System.out.println(" ci:"+ci);

		
				 





	}

}
