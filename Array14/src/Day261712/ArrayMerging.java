package Day261712;

public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {1,2,3,4,5};
		int array2[]= {10,11,12,13,14,15};
		int array3[]=new int[array1.length+array2.length];
		int index=0;
		for (int i = 0; i < array1.length; i++)
		{
			array3[index++]=array1[i];
			
		}
		for (int i = 0; i < array2.length; i++)
		{
			array3[index++]=array2[i];
		}

		System.out.println("merge array:");
		for(int x: array3)
		{
			System.out.print(" "+x);
		}
	}

}
