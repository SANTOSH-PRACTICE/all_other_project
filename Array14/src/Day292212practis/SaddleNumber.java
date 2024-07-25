package Day292212practis;

public class SaddleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},
				    {5,6,7},
				    {2,5,6}
		};
		int min=0;
		int max=0;
		int col=0;
		int element=a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
			{if(a[i][j]<element)
			{
				element=a[i][j];
				col=j;
			}
				
			}
			min=element;
			
			
			for (int i1 = 0; i1 < 3; i1++) 
			{
				if(a[i1][col]>element)
				{
					element=a[i1][col];
				}
			}
			max=element;
			
		
		if(max==min)
		{
			System.out.println("Saddle number is:"+element);
		}
		}
	}

}
