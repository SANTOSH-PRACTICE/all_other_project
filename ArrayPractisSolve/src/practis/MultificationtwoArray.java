package practis;

import java.util.Scanner;

public class MultificationtwoArray {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  
   System.out.println("Enter row");
   int row=sc.nextInt();
   
   System.out.println("Enter col");
   int col=sc.nextInt();
   int a[][]=new int[row][col];
   
   System.out.println("Enter the element");
   for (int i = 0; i < row; i++)
   {
	for (int j = 0; j < col; j++)
	{
		a[i][j]=sc.nextInt();
	}
   }
   for (int i = 0; i < a.length; i++) {
	     for (int j = 0; j < a.length; j++) 
	     {
			System.out.print(a[i][j]+" ");
		}
	     System.out.println();
	   }
   
   
   
   System.out.println("Enter row");
   int row1=sc.nextInt();
   
   System.out.println("Enter col");
   int col1=sc.nextInt();
   int a1[][]=new int[row1][col1];
   
   System.out.println("Enter the element");
   for (int i = 0; i < row1; i++)
   {
	for (int j = 0; j < col1; j++)
	{
		a1[i][j]=sc.nextInt();
	}
}
   
   for (int i = 0; i < a1.length; i++) {
	     for (int j = 0; j < a1.length; j++) 
	     {
			System.out.print(a1[i][j]+" ");
		}
	     System.out.println();
	   }
 
   
   int a2[][]=new int[row][col];
   for (int i = 0; i < a.length; i++) 
   {
	for (int j = 0; j < a2.length; j++) 
	{
		for (int k = 0; k <a2.length; k++) 
		{
			a2[i][j]=a2[i][j]+(a[i][k]*a[k][j]);
		}
	}
   }
   for (int i = 0; i < a2.length; i++) {
     for (int j = 0; j < a2.length; j++) 
     {
		System.out.print(a2[i][j]+" ");
	}
     System.out.println();
   }
   
   
	}

}
