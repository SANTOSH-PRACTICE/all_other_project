package Day282112class;

public class sumOfDiagonalEleMEmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,1}};
		
		int sum=0;
		int count=0;
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if((j-i==0)||(j+i==a.length-1))
				{
					System.out.print(a[i][j]+" ");
					sum=sum+a[i][j];
					count++;

				}
				else
				{
					System.out.print("  ");
				}}
				System.out.println();
			
			
		}
		System.out.println("sum of diagonal element : "+sum);
		System.out.println("count of Diagonal element : "+count);
		}

	}




	


