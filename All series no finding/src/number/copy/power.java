package number.copy;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int base ,exponent,power=1;
		System.out.println("Enter base:");
		base =sc.nextInt();
		
		System.out.println("Enter exponent:");
		exponent =sc.nextInt();
		while(exponent!=0)
		{
			power= base *power;
			exponent--;
			
		}
		
		System.out.println("power"+power);
		
		



	

	}

}
