package practis;

import java.util.Scanner;

public class compomdinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principle ,rate,n,time;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter priciple amount:");
		principle=sc.nextFloat();
		System.out.println("Enter  valve of n:");
		n=sc.nextFloat();
		
		System.out.println("Enter interrest rate:");
		rate=sc.nextFloat();
		System.out.println("Enter time in year:");
		time =sc.nextFloat();
		
		double amount =principle*(Math.pow(1+(rate/n),(n* time)));
		System.out.println("amont:"+amount);
		
		double ci=amount-principle;
		System.out.println("compond interest:"+ci);
		
		
		





	}

}
