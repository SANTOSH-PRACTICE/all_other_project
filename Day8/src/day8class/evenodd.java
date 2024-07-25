package day8class;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		int temp=num1;
		while(num1<num2)
		{
			if(num1 % 2 ==0)
			{
				System.out.println("even number:"  +num1);
			}
			num1++;
			
		}
		
		while(temp<num2)
		{
			if(temp % 2 !=0)
			{
				System.out.println("odd number:"  +temp);
			}
		
		
	       temp++;
			
		}


	}

}
