package Day251612practis;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {17,20,23,11,12,13,15,17,18,19};
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i+1; j < array.length; j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					     array[i]=array[j];
					     array[j]=temp;
				}
				
			}}
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(" "+array[i]);
			}
			System.out.println();
		int first=0;
		int end=array.length-1;
		int element=21;
		
		while(first<=end)
		{
			int mid=(first+end)/2;
			
				if(array[mid]==element)
				{
					System.out.println("element are matched: "+array[mid]);
					System.out.println("index :"+mid);
					break;
				}
				else if(element<array[mid])
				{
					end=mid-1;
				}
				else
				{
					first=mid+1;
				}
			}
		System.out.println();
		if(first>end) {
		
System.out.println("the given number does not matched:");
	}
	}
}
