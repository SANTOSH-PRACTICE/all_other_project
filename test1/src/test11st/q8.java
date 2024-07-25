package test11st;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the principle valve:");
		int principle=sc.nextInt();
		
		System.out.println("enter the time valve:");
		int time=sc.nextInt();
		
		System.out.println("enter the rate valve:");
		int rate=sc.nextInt();
		
		
		int amount = (principle*rate*time);
		System.out.println("total amount"+amount);
		
		int si = amount- principle;
		System.out.println("simple interest"+si);


		


	}

}
