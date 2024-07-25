package day8class;

import java.util.Scanner;

public class factorialdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numer to count factorial:");
		int num =sc.nextInt();
		int fact=1;
		do	{
			fact=fact*num;
			num--;
		}
		while(num>1);
            System.out.println("factorial is:"+fact);
		}

}
