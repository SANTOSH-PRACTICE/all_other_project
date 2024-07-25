package Day261712;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,4,5,6,7,9,1,6};
		for (int i = 0; i < a.length; i++)
		{
			int j = i;
			int temp=a[i];
			for (; j > 0; j--) 
			{
				if(a[j-1]>temp)
				{
					a[j]=a[j-1];
				}
				else
					break;
				
			}
			a[j]=temp;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
