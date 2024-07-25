package Day251612practis;

import java.util.Scanner;

public class Arraymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter size of col: ");
		int col=sc.nextInt();
		int array[][]=new int[row][col];
		System.out.println("Enter element : ");
		for (int i = 0; i <row; i++)
		{
			for (int j = 0; j < col; j++) {
				 array[i][j]= sc.nextInt();
			}
			
		}
		System.out.println("new array: ");
		
		for(int in[]:array)
		{
			for (int x:in) 
			{
				System.out.print(" "+x);
				
			}
			System.out.println();
		}

	}

}
