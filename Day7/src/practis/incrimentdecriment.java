package practis;

import java.util.Scanner;

public class incrimentdecriment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("enter valve of number1:");
		num1=sc.nextInt();
		
		System.out.println("enter valve of number2:");
		num2=sc.nextInt(); 
		
		System.out.println("enter valve of number3:");
		num3=sc.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.println("the number is incriment order");
		}
		
		else if(num1>num2 && num2>num3)
		{
			System.out.println("the number is decriment order");

		}
		
		else 
		{
			System.out.println("niether inciment nor decriment order");
	
		}
		
	}

}
