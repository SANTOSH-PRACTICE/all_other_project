package Day292212Class;

public class MinimunInEveryRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
	
		          };
		for (int i = 0; i<3; i++) 
		{
		int min=a[i][0];
		for (int j = 0; j < 3; j++) {
			if(a[i][j]<min)
			{
				min=a[i][j];
			}
		}
		System.out.println(" "+min);
		}
	}
    }
