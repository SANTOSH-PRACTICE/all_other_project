package day8practis;

import java.util.Scanner;

public class powerdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int base ,exponent,power=1;
		System.out.println("Enter base:");
		base =sc.nextInt();

		System.out.println("Enter exponent:");
		exponent =sc.nextInt();
		 
		do {
			power= base *power;
			exponent--;
			
		}
	
     while(exponent!=0);
		
		   System.out.println("power"+power);

	

	}
	}

