package Day282112practi;

public class MatrixOutsideElement {

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
			for (int j = 0; j < a.length; j++) {
				
				if((i==0)||(i==3)||(j==0)||(j==3))
				{
					System.out.print(a[i][j]+" ");
					sum=sum+a[i][j];
					
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println("sum: "+sum);

	}

}
