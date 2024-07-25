package Practis;

public class anticlockwisedirectionby2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
					{ 1, 2, 3, 4 },
					{ 5, 6, 7, 8 }, 
					{ 9, 0, 1, 2 }, 
					{ 3, 4, 5, 6 }
					};
		for (int[] is : a)
		{
			for (int i : is) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		int imin = 0;
		int imax = 3;
		int jmin = 0;
		int jmax = 3;
		while (imin <= imax) 
		{

			int temp = a[imin][jmin];
			for (int j = jmin; j < jmax; j++)
			{
				a[imin][j] = a[imin][j+ 1];
			}
			for (int i = imin; i < imax; i++)
			{
				a[i][jmax] = a[i + 1][jmax];
			}
			for (int j = jmax; j > jmin; j--)
			{
				a[imax][j] = a[imax][j - 1];
			}
			for (int i = imax; i > imin; i--) 
			{
				a[i][jmax] = a[i - 1][jmin];
			}
			a[imin + 1][jmin] = temp;
			imin++;
			jmin++;
			imax--;
			jmax--;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
