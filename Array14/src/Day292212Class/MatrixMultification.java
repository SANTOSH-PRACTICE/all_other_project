package Day292212Class;

public class MatrixMultification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},
				  {3,4}};
		int b[][]= {{3,4},
				   {1,2}
		};
		int c[][]=new int [2][2];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) 
			{
				for (int k = 0; k < c.length; k++) {
					
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
for (int i = 0; i < c.length; i++) {
	for (int j = 0; j < c.length; j++) {
		
	System.out.print(c[i][j]+"  ");
	
	}
	System.out.println();
	}

}}
