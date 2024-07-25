package test11st;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the principle valve:");
		int principle=sc.nextInt();
		
		System.out.println("Enter the rate valve:");
		float rate=sc.nextFloat();
		
		System.out.println("Enter the  Time valve:");
		int time =sc.nextInt();
		
		System.out.println("Enter the  n valve:");
		float n =sc.nextFloat();
		
		double amount = (principle*(Math.pow (1+(rate/n) , (n* time)))) ;
		
		System.out.println("total amount:" +amount);
		
		double ci= sc.nextInt();
		ci= amount - principle;
		System.out.println("total ci:" +ci);


		
		
		
		

		
		

		
		

		
		
		

	}

}
