package Day292212practis;

public class MaximumInEveryRow {

	public static void main(String[] args) {
        int a[][]= {{1,3,4},
        		    {4,5,3},
        		    {4,6,2}};
        
        for (int i = 0; i < 3; i++)
        {
        	int max=a[0][i];
			for (int j = 0; j <3; j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println("maximum valve in  Row: "+max);

		}

	}

}
