package Day14oops112;

import java.util.Scanner;

public class MetodOverloading {
	Scanner sc =new Scanner(System.in);
	int num1,num2;
	void input()
	{
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		System.out.println("Enter number2:");
		num2=sc.nextInt();
		
		sum();
		sum(num1,num2);
		sum("rahul",num2);
	}
	public void sum()
	{
		int res=num1+num2;
		System.out.println(res);
		
	}
	
	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sum(String x,int y)
	{
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args)
	{
		MetodOverloading mo= new MetodOverloading();
		mo.input();
		
	}
	

	

}
