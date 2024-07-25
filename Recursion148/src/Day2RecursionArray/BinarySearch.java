package Day2RecursionArray;

public class BinarySearch {

	public static void main(String[] args) {

		int a[]= {22,2,4,5,1,7,8,11,12};
		loopSortI(0,a);
		LoopPrintA(0,a);
		
		
		int first=0;
		int last=a.length-1;
		int mid=0;
		int element=1;
		LoopBinary(first,last,mid,a,element);
		
		if(first>last)
		{
			System.out.println("Element is not found");
		}
		
		
	}

	private static void LoopBinary(int first, int last, int mid, int[] a, int element) {
         if(first<=last)
         {
        	 mid=(first+last)/2;
 			if(element==a[mid])
 			{
 				System.out.println("element is found in index:"+mid);
 				return;
 			}
 			else if(element<a[mid])
 			{
 				last=mid-1;
 			}
 			else
 			{
 				first=mid+1;
 			}
        	 
        	 LoopBinary(first, last, mid, a, element);
         }
	}

	private static void LoopPrintA(int i, int[] a) {
        if(i<a.length)	
        {
			System.out.println(a[i]);

        	i++;
        	LoopPrintA(i, a);
        }
	}

	private static void loopSortI(int i, int[] a) {
		if(i<a.length)
		{      loopSortJ(i,(i+1),a);
			
			i++;
			loopSortI(i, a);
		}
		
	}

	private static void loopSortJ(int i, int j, int[] a) {

		if(j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;
			loopSortJ(i, j, a);
		}
	}
	}


