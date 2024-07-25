package Day282112class;

public class DiagonalAndAniDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},
				     { 4,5,6},
				     {7,8,9}};
				     
		int count=0;
		int count1=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{ if((j-i==0)||(j+i==2))
			{
				System.out.print(a[i][j]+" ");
				count++;
			}
			else
			{
				System.out.print(" ");
				count1++;
				
			}}
				System.out.println();
			
		}
		int diagonalArray[]=new int[count];
		int antiDiagonalArray[]=new int[count1]; 
		int index=0;
		int index1=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) {
				 if((j-i==0)||(j+i==2))
				 {
					 diagonalArray[index++]=a[i][j];
					 
				 }
				 else
				 {
					 antiDiagonalArray[index1++]=a[i][j];
				 }
			}
		}
		System.out.println("Diagonal Array: ");
		for(int x:diagonalArray)
		{
			System.out.print(" "+x);
		}
		System.out.println();
		System.out.println("antiDiagonal Array: ");
		for(int x:antiDiagonalArray)
		{
			System.out.print(" "+x);
		}
	}

}
