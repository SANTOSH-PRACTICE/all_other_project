package Day2516122darray;

public class bubbleSorting {

	public static void main(String[] args) {     //bubble Sorting 
		// TODO Auto-generated method stub
		int []array= {99,56,12,67,2,99,4};
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array.length-1; j++) 
		    {if(array[j]>array[j+1])
		    {
		    	int temp=array[j];
		    	array[j]=array[j+1];
		         array[j+1]=temp;
		    }
				
			}	
		}
		System.out.println("After Sorting:...");
		for(int x: array)
		{
			System.out.print(" "+x);
		}

	}

}
