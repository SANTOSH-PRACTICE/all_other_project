package Day2516122darray;

import java.util.Scanner;

public class ArrayMatrix {
	void matrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter size of col: ");
		int col=sc.nextInt();
		
		int number[][]=new int [row][col];
		System.out.println("Enter Element : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
		
		//display
		System.out.println("the Matrix is: ");
	/*	for(int i=0;i<row;i++)
		{
			for (int j = 0; j< col; j++) 
			{
			System.out.print(" "+number[i][j]);	
			}
			System.out.println();
		}*/
		for(int[] ina:number)
		{
			for(int x: ina)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMatrix a=new ArrayMatrix();
		a.matrix();

	}

}
