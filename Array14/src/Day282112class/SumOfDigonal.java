package Day282112class;

public class SumOfDigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     //booklet no 31
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,1}};
		
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if((j-i==0)||(j+i==2))
				{
					sum=sum+a[i][j];
					System.out.print(" "+a[i][j]);
				}}
				System.out.println();
			
			
		}
		System.out.println("sum of diagonal element : "+sum);
		}

	}


