package day2314practis;

import java.util.Scanner;

public class CopyArray {
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int numbers1[]=new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++)
		{
		numbers1[i]=sc.nextInt();
		
		}
		display(size, numbers1, numbers1);

	}
	
	void copyElemet(int number1[],int size)
	{
		int number2[]=new int[size];
		for(int i=0;i<size;i++)
		{
		number2[i]=number1[i];
		
		}
	}
	void display(int size,int number1[],int number2[])
	{
		System.out.println("first element:");
		for(int i=0;i<size;i++)
		{
			System.out.println(number1[i]);
		
		}
		System.out.println("second element:");

		for(int i=0;i<size;i++)
		{
			System.out.println(number2[i]);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyArray ob= new CopyArray();
		ob.input();
		

	}

}
