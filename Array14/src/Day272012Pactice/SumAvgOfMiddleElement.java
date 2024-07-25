package Day272012Pactice;

public class SumAvgOfMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
			     	{2,3,5,6},
			     	{1,4,5,6},
			     	{1,2,5,7}};
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
System.out.println("sum: "+sum );
System.out.println("avg: "+(sum/count));
	}

}
