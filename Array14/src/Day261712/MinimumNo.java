package Day261712;

public class MinimumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]={ {10,34,78},
		               {89,45,67},
		               {4,5,7}};
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++) {
				
			
			if(array[i][j]<min)
			{
			   min=array[i][j];
			   
			}
			}
		}
		System.out.print(min);

	}

}
