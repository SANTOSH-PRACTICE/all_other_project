package number;

import java.util.Scanner;

public class numbercounting {//digit count

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numer to count factorial:");
		int number =sc.nextInt();
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			   sum=sum+rem;
			   number=number/10;
			   
		}
		System.out.println("sum of digit:"+sum);

	}

}
