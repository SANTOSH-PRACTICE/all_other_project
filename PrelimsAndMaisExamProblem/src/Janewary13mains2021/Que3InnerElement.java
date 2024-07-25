package Janewary13mains2021;

public class Que3InnerElement {

	public static void main(String[] args) {

		
		int a[][]= {{1,2,3,4},
				    {7,8,5,6},
				    {4,5,7,6},
				    {2,3,9,5}
		};
		int sum=0;
		for (int i = 1; i < a.length-1; i++)
		{
			for (int j = 1; j < a.length-1; j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("sum: "+sum);
	}

}
