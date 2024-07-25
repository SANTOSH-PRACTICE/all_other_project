package day2314practis;

import java.util.Scanner;

public class Indexing {
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		
		int numbers[]=new int[size];
		System.out.println("Enter Element: ");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter the Element whoose index you want:");
		int element=sc.nextInt();
		int x=serachIndexElment(numbers,element);
		display(numbers,x);
		
	}
	
	int serachIndexElment(int numbers[],int element)
	{
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] == element)
			{
				return 1;
			}
	 		
			
		}
		 return -1;
	}

	void display(int numbers[] ,int x) 
	{
		System.out.println("element of first array: ");
		for(int i:numbers)
		{
			System.out.println(i);
		}
		System.out.println("Index of given element is: "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indexing ob=new Indexing();
		ob.input();
	}

}
