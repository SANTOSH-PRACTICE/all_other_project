package day231412;

import java.util.Scanner;

public class SumAvgArray {
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("Enter elements: ");
		for (int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
			
		}
		sumAvgElements(numbers);
				
	}
	void sumAvgElements(int numbers[])
	{
		int sum=0,avarage;
		for (int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
		}
		avarage=sum/numbers.length;
		display(numbers,sum,avarage);
		
	}
	void display(int numbers[],int sum,int avarage)
	{
		System.out.println("the Entered element are: ");
		for (int i:numbers)
		{
			System.out.println(i);
		}
		System.out.println("the sum of element of array are: "+sum);
		System.out.println("the avagre is: "+avarage);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAvgArray ob=new SumAvgArray();
		ob.input();

	}

}
