package day122911;

import java.util.Scanner;

public class AdditionDemo {

	
	int number1,number2,result;
	Scanner sc =new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter number 1:");
		number1=sc.nextInt();
		
		System.out.println("Enter number 2:");
		number2=sc.nextInt();
	}
	
	void addition()
	{
		result=number1+number2;
		System.out.println("addition of two number is:"+result);
	}
	
	void subtraction()
	{
		result=number1-number2;
		System.out.println("subtraction of two number is:"+result);
	}
	
	void multification()
	{
		result=number1*number2;
		System.out.println("multification of two number is:"+result);
	}
	
	void division()
	{
		result=number1/number2;
		System.out.println("division of two number is:"+result);
	}
	
}
