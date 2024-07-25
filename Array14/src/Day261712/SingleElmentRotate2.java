package Day261712;

public class SingleElmentRotate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6};
		int temp=array[0];
		for (int i = 0; i < array.length-1; i++) 
		{
			array[i]=array[i+1];
		}

		array[array.length-1]=temp;
		for(int x:array)
		{
			System.out.print(" "+x);
		}
	}

}
