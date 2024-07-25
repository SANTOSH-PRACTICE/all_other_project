package Day2516122darray;

public class ShortingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= {10,11,12,13,14,15,16,17};
		int first=0;
		int last=array.length;
		int mid=0;
		int element=11;  // number can change and check.
		while(first<=last)
		{
			mid=(first+last)/2;
			if(element==array[mid])
			{
				System.out.println("Element foud at index: "+mid);
				break;
			}
			else if(element<array[mid])
			{
				last=mid-1;
			}
			else
			{
				first=mid+1;
			}
		}
		if(first>last)
		{
			System.out.println("Element not found....");
		}
	}
}
