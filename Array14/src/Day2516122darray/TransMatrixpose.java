package Day2516122darray;

import java.util.Scanner;

public class TransMatrixpose {

	void inputMatrix(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of row: ");
		int row=sc.nextInt();
		
		System.out.println("Enter Size of col: ");
		int col=sc.nextInt();
		int matrix1[][]=new int[row][col];
		
		System.out.println("Enter elements for matrix1: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		operation(matrix1,row,col);

	}
	void operation(int matrix1[][],int row,int col)
	{
		int matrix2[][]=new int [row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[j][i]=matrix1[i][j];
				
			}
		}
		display(matrix2);
	}
	
	void display(int matrix2[][])
	{
		System.out.println("Matrix2 after transpose: ");
		for(int in []:matrix2)
		{
			for(int x:in)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TransMatrixpose t=new TransMatrixpose();
			t.inputMatrix();
		
	}

}
