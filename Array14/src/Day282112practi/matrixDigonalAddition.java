package Day282112practi;

public class matrixDigonalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
				    {4,5,6,7},
				    {1,2,3,4},
				    {1,3,4,5}
		};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < a.length; j++)
		{
			if((j-i==0)||(j+i==3))
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
				
			}
			else
				System.out.print(" ");
		}	
		System.out.println();}
		System.out.println("sumetion: "+sum);
		
		

	}

}