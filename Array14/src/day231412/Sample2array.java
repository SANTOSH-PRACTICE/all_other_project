package day231412;

import java.util.Scanner;

public class Sample2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter elements: ");
		for(int i=0;i<5;i++)
		{
			numbers[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(numbers[i]);
		}
			
		

	}

}
