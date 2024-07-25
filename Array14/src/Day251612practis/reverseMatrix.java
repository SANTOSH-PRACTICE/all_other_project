package Day251612practis;

import java.util.Scanner;

public class reverseMatrix {

	void matrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter size of col:");
		int col=sc.nextInt();
		int [][]array=new int[row][col];
		
		System.out.println("Enter element: ");
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				 array[i][j]=sc.nextInt();
			}
		}
		operation(array,row,col);
	}
		void operation(int array[][],int row,int col)
		{
	        int  array1[][]=new int[row][col];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					 array1[j][i]=array[i][j]; 
				}
				
			}
			display(array1);
		}
		
		void display(int array1[][])
		{
			System.out.println("after reverse:");
			for(int in[]:array1)
			{
				for(int x: in)
				{
					System.out.print(" "+x);
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseMatrix r=new reverseMatrix();
		r.matrix();
	

	}

}
