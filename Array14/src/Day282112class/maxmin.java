package Day282112class;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,60},
				{7,8,1}};
		int max=0;
		int min=a[0][0];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
					
				}
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}}
			System.out.println("Maximum element in matrix: "+max);
			System.out.println("Minimum element in matrix: "+min);
	}

}
