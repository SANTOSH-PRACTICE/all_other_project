package prelimA4April;

public class que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int[][]a=new int[n*2-1][n*2-1];
		int imin=0;
		int imax=a.length-1;
		int jmin=0;
		int jmax=a.length-1;
		while(jmin<=jmax)
		{
			for (int j = jmin; j <jmax ; j++)
			{
				a[imin][j]=n;
			}
			for (int i = imin; i <imax; i++)
			{
				a[i][jmax]=n;
			}
			for (int j = jmax; j >=jmin ; j--)
			{
				a[imax][j]=n;
			}
			for (int i = imax; i >=imin; i--)
			{
				a[i][jmin]=n;
			}
			
			imin++;imax--;jmin++;jmax--;n--;
			
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println("   ");
		}


	}

}
