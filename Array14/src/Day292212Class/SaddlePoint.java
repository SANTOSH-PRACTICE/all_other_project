package Day292212Class;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{6,3,1},
				{9,7,8},
				{2,4,5}
		};
		int element=a[0][0];
		int col=0;
		int max=0;
		int min=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
		{
			if(a[i][j]<element)
			{
				element=a[i][j];
				col=j;
			}
		}
		min=element;
		for (int i1 = 0; i1 < 3; i1++) 
		{
			if(element<a[i1][col])
			{
				element=a[i1][col];
			}
		}
		max=element;
		if(max==min)
		{
			System.out.println("saddle point is: "+element);
		}
			
		}
		

	}

}
