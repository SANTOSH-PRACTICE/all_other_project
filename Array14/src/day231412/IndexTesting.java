package day231412;

import java.util.Scanner;

public class IndexTesting {
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
	System.out.println("Enter the Element whoose index you want: ");
	int element=sc.nextInt();
	
	int x=searchIndexElement(number1,element);
	display(number1,x);
	}
	
	int searchIndexElement(int number1[],int element)
	{
		for(int i=0;i<number1.length;i++)
		{
			if(number1[i]==element)
			{
				return 1 ;
			}
			
		}
		return -1;
	}
	void display(int number1[],int x)
	{
		System.out.println("Element of first array are: ");
		for(int i:number1)
		{
			System.out.println(i);
		}
		System.out.println("Index of given element is: "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndexTesting ob=new IndexTesting();
		ob.input();

	}

}

