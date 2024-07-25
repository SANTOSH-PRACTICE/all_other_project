package Day272012class;

public class SumAvgMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,2},
				{4,5,6,4},
				{1,8,9,1},
				{1,2,3,4}
				
		};
		
		int sum=0;
		int count=0;
		for (int i = 1; i < a.length-1; i++) 
		{
			for (int j = 1; j < a.length-1; j++) 
			{
				sum=sum+a[i][j];
				count++;
				
			}
		}
		System.out.println("sum : "+sum);
		int avg=sum/count;
		System.out.println("Avarage : "+avg);

	}

}
