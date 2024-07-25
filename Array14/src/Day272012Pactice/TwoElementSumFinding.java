package Day272012Pactice;

public class TwoElementSumFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,12};
		int num=8;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j]==num)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
