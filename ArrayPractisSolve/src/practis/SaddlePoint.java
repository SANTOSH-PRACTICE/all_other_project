package practis;

public class SaddlePoint {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},
				  {4,3,7},
				  {7,6,8}};
		int max=0;
		int min=Integer.MAX_VALUE;
		int ele=a[0][0];
		int col=0;
		
		for (int i = 0; i < a.length; i++)
		{
			
			for (int j = i; j <3; j++) 
			{
				if(a[i][j]<ele)
				{
					ele=a[i][j];
					col=j;
					
				}
				
			}
			min=ele;
			
			for (int j = 0; j < 3; j++) 
			{
				if(a[j][col]>ele)
				{
					ele=a[j][col];
				}
			}
			max=ele;
		}
			if(max==min)
			{
				System.out.println(max);
			}
			
		
		}
	}


