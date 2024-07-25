package Day251612practis;

import java.util.Scanner;

public class AdditionMatrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int row=sc.nextInt();
			
		System.out.println("Enter the size of col: ");
		int col=sc.nextInt();
		
		int [][] matrix1=new int[row][col];
		int [][] matrix2=new int[row][col];
		int [][] matrix3=new int[row][col];
		
		
		System.out.println("Enter element for matrix1:");
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1.length; j++) 
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
			
		System.out.println("Enter element for matrix2:");
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < matrix2.length; j++) 
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		//sum
		for (int i = 0; i < matrix3.length; i++)
		{
			for (int j = 0; j < matrix3.length; j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		//display
		System.out.println("addition matrix: ");
		for(int in[]: matrix3)
		{
			for(int x :in)
			{
			System.out.print(" "+x);	
			}
			System.out.println();
		}
		

	}

}
