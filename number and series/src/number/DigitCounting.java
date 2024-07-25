package number;

import java.util.Scanner;

public class DigitCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int sum=0;
		
		
	  while(num>0)
	  {
		  int rem=num%10;
		  sum=sum+rem;
		  num=num/10;
		  
		  
	  }
	  System.out.println("sum of digit: "+sum);

	}

}
