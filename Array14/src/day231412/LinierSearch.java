package day231412;

import java.util.Scanner;

public class LinierSearch {
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
		System.out.println("Enter the Element to be searched: ");
		int element=sc.nextInt();
	 display (number1);
	 searchElement(number1,element);
	 
	}
	
	void searchElement(int[] number1,int element)
	{
		int j=0;
		for(int i=0;i<number1.length;i++)
		{
			if(number1[i]==element)
			{
				System.out.println("Element found at index "+(i));
				j++;
				break;
			}
		}
		
		if(j==0)
		{
			System.out.println("Element not found");
		}
	}
	
	void display(int number1[])
	{
		System.out.println("Element of first array are: ");
		for(int i:number1)
		{
			System.out.println(i);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinierSearch ob=new LinierSearch();
		ob.input();
	}}