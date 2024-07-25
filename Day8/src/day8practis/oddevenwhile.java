package day8practis;

import java.util.Scanner;

public class oddevenwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("enter num 1");
		num1=sc.nextInt();
		
		System.out.println("enter num 2");
		num2=sc.nextInt();
		
		int temp =num1;
		while(num1<num2)
		{
			if(num1 % 2 == 0)
			{
         System.out.println("even number"+num1);			
		}
		num1++;
		
	   }
	
	
	while(temp<num2)
	{
		if(temp % 2 != 0)
		{
     System.out.println("odd number"+temp);			
     }
	temp++;
	}

	}
}
