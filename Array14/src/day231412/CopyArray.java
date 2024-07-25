package day231412;

import java.util.Scanner;

public class CopyArray {
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int number1[]=new int[size];
		System.out.println("Enter elements: ");
		for (int i=0;i<size;i++)
		{
			number1[i]=sc.nextInt();
			
		}
		
		copyElement(number1,size);

         }
	void copyElement(int number1[],int size)
	{
		int number2[]=new int[size];
		for(int i=0;i<size;i++)
		{
			number2[i]=number1[i];
		}
		display(number1,number2);
	}
	
	
	void display(int number1[],int number2[])
	{
		System.out.println("element of first array are: ");
		for(int i:number1)
		{
			System.out.println(i);
		}
		System.out.println("element of second array are: ");
		for(int i:number2)
		{
			System.out.println(i);
		}

	}
	public static void main(String[] args) {
		CopyArray ob= new CopyArray();
		ob.input();
		
	}
	
}