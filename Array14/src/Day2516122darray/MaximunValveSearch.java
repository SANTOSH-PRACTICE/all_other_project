package Day2516122darray;

public class MaximunValveSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{7,8,9,10},
				{1,2,5,7}
			
		};
		int max=0;
		
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
				}
			}
		}
		System.out.println("maximum number:"+max);

	}

}
