package practis;

public class Addition {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},
				{2,3,4},
				{4,6,4}};
		
		int b[][]= {{1,2,3},
				{2,3,4},
				{4,6,4}};
		
			int c[][]=new int[3][3];	
			
			for (int i = 0; i < c.length; i++)
			{
				for (int j = 0; j < c.length; j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for (int i = 0; i < c.length; i++)
			{
				for (int j = 0; j < c.length; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
				
		}
	}


