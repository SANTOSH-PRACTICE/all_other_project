package Day251612practis;

public class MaximumNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] ={ {2,3,6,12},
		                {7,14,2,7},
		                {6,2,4,5}};
		int max=0;
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
				if(array[i][j]>max)
				{
				   max=array[i][j]	;
				   
				}
			}
		}
		System.out.println("maximum valve: "+ max);
		

	}

}
