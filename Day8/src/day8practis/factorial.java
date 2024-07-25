package day8practis;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numer to count factorial:");
		int num =sc.nextInt();
		int fact=1;
		
		while(num>1)
			{

			fact=fact*num;
			num--;
			
	}
System.out.println("factorial is:"+fact);
}
}