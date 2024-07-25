package day231412;

import java.util.Scanner;

public class Simple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();  // only int type
		int numbers[]=new int[size];
		
		System.out.println("Enter Elements: ");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
	//	for(int i=0;i<size;i++)
	//	{
     //    System.out.println(numbers[i]);	
     //    }
		for(int i:numbers)
		{
			System.out.println(i);
		}

	}

}
