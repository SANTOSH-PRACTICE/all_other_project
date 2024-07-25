package Day272012Pactice;

import java.util.Scanner;

public class DiffrancebetMaxMinEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size: ");
		int row=sc.nextInt();
		int a[]=new int[row];

		
		System.out.println("Enter Element: ");
		for (int i = 0; i <row; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Arrangend array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		int min=a[0];
		System.out.println("minimum valve: "+min);
		
		int max=a[a.length-1];
		System.out.println("Maximum number: "+max);
		
		int diff=max-min;
		System.out.println("diffrance: "+diff);
	}

}
