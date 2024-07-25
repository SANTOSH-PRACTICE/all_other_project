package day231412;

import java.util.Scanner;

public class SampleMetodUse {
	void inputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int numbers[]=new int[size];
		
		System.out.println("Enter "+size+" Element: ");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		displayArray(numbers,size);
		
	}
	void displayArray(int numbers[],int size) {
		System.out.println("The total element are :"+size);
		for(int i:numbers)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SampleMetodUse().inputArray();
		

	}

}
