package day231412;

import java.util.Scanner;

public class Sample5methoduse {

	
	 int[] inputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int numbers[]=new int[size];
		
		System.out.println("Enter "+size+" Element: ");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		return numbers;
		
	}
	void displayArray()
	{
		int numbers[]=inputArray();   //we can use [int numbers] any other name like x. 
		System.out.println("The entered element are :");
		for(int i:numbers)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample5methoduse().displayArray();
		

	}
	}


