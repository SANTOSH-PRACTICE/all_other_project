package day2314practis;

import java.util.Scanner;

public class SumAvarage {
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		
		int number[]=new int[size];
		
		System.out.println("Enter Elements:");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		sumAvarage(number);
	}
	void sumAvarage(int number[])
	{ int sum=0,avarage;
	for(int i=0;i<number.length;i++)
	{
		sum=sum+number[i];
	}
	avarage=sum/number.length;
	display(sum,avarage,number);
	
	}
	void display(int sum,int avarage,int number[])
	
	{
		System.out.println("Entered elements are: ");
		for(int i: number)
		{
			System.out.println(i);
		}
		
		System.out.println("sum of element: "+ sum+" avarage: "+avarage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAvarage ob=new SumAvarage();
		ob.input();

	}

}
