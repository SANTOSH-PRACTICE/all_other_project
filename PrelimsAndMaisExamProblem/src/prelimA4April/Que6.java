package prelimA4April;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int[][]a=new int[n][n];
		int imin=0;
		int imax=n-1;
		int jmin=0;
		int jmax=n-1;
		int counter=1;
		while(jmin<=jmax)
		{
			for (int j = jmin; j <jmax ; j++)
			{
				a[imin][j]=counter++;
			}
			for (int i = imin; i <imax; i++)
			{
				a[i][jmax]=counter++;
			}
			for (int j = jmax; j >jmin ; j--)
			{
				a[imax][j]=counter++;
			}
			for (int i = imax; i >imin; i--)
			{
				a[i][jmin]=counter++;
			}
			if(imin==imax&&jmin==jmax)
			{
				a[imin][jmin]=counter++;
			}
			imin++;imax--;jmin++;jmax--;
			
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
