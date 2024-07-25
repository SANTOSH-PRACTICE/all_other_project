package Day261712Practis;

public class InsersionSortng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {3,1,8,5,6,4,9,7,2};
		
		for (int i = 0; i < array.length; i++) 
		{
		int j=i;
		int temp=array[i];
		for (; j >0; j--) {
			if(array[j-1]>temp)
			{
				array[j]=array[j-1];
				
			}
			else 
				break;
			
		}
		array[j]=temp;

		}

		for(int x:array) {
		System.out.println(" "+x);
	     }
	}
}
