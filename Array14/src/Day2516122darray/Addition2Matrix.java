package Day2516122darray;

import java.util.Scanner;

public class Addition2Matrix {
	void matrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of row: ");
		int row=sc.nextInt();
		
		System.out.println("Enter Size of col: ");
		int col=sc.nextInt();
		
		int matrix1[][]=new int[row][col];
		int matrix2[][]=new int[row][col];
		int matrix3[][]=new int[row][col];
		
		System.out.println("Enter Element for matrix1: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Element for matrix2: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		// sum
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		//display
		System.out.println("addition matrix");
    	/*	for(int[] ina: matrix3)
		{
			for(int x: ina)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		 }*/
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3.length; j++) {
				
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition2Matrix a=new Addition2Matrix();
		a.matrix();

	}

}
