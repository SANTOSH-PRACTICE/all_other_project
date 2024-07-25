package Day2RecursionArray;

import java.util.Scanner;

public class TwoDimMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		
		System.out.println("Enter col");
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		System.out.println("enter element: ");
		
		loopEntI(0,row,col,sc,a);
		loopPrintI(0,row,col,sc,a);
	}

	private static void loopPrintI(int i, int row, int col, Scanner sc, int[][] a) {
		if(i<row)
		{
			loopPrintJ(i,0,row,col,sc,a);
			System.out.println();
			i++;
			loopPrintI(i, row, col, sc, a);
		}
	}
	private static void loopPrintJ(int i, int j, int row, int col, Scanner sc, int[][] a) {
            if(j<col)
            {
            	System.out.print(  a[i][j]+" ");
            	j++;
            	loopPrintJ(i, j, row, col, sc, a);
            }
	}
	private static void loopEntI(int i, int row, int col, Scanner sc, int[][] a) {
		if(i<row)
		{
			loopEntJ(i,0,row,col,sc,a);
			i++;

			loopEntI(i, row, col, sc, a);
		}
	}

	private static void loopEntJ(int i, int j, int row, int col, Scanner sc, int[][] a) {
		if(j<col)
		{
			a[i][j]=sc.nextInt();
			j++;

			loopEntJ(i, j, row, col, sc, a);
		}
	}

}
