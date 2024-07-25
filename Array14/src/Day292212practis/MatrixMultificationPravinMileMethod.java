package Day292212practis;

import java.util.Scanner;

public class MatrixMultificationPravinMileMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row for a: ");
		int arow=sc.nextInt();
		
		System.out.println("Enter col for a: ");
		int acol=sc.nextInt();

		
		System.out.println("Enter row for b: ");
		int brow=sc.nextInt();

		
		System.out.println("Enter col for b: ");
		int bcol=sc.nextInt();
		
		int a[][]=new int[arow][acol];
		int b[][]=new int[brow][bcol];
		
		System.out.println("Enter Element ");
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
         
		System.out.println("Enter Element");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				b[i][j]=sc.nextInt();
			}
		}

		int c[][]=new int[arow][bcol];
		if(acol==brow)
		{
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a.length; j++) 
				{
					for (int k = 0; k <a[i].length; k++) 
					{
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
					
				}
				
			}
		}
		else
			System.out.println("plese enter in rule...");
		
		System.out.println("Matrix multification : ");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}
