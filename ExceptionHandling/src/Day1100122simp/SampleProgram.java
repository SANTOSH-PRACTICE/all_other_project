package Day1100122simp;

import java.util.Scanner;

public class SampleProgram {
	
	static void m1()
	{
		m2();
		System.out.println("in m1");
		
	}
	static void m2()
	{
		m3();
		System.out.println("in m2");
	}
	static void m3()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int res=0;
		try
		{
			res=num1/num2;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
			System.out.println("Infinite");
		}
		System.out.println(res);
		
		System.out.println("in m3");
		
	}

	public static void main(String[] args) {
          m1();
          System.out.println("in main ");
	}

}

