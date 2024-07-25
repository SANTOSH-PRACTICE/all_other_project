package Day272012Pactice;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		int evenCount=0;
		int oddCount=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
				
			}
			
		}
		
		int evenArray[]=new int[evenCount];
		int oddArray[]=new int[oddCount];
		int mergeArray[]=new int[a.length];
		
		int evenIndex=0;
		int oddIndex=0;
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				evenArray[evenIndex++]=a[i];
				
			}
			else
			{
				oddArray[oddIndex++]=a[i];
			}
			
		}
		
		for (int i = 0; i < evenArray.length; i++)
		{
			mergeArray[index++]=evenArray[i];
			
		}
		
		for (int i = 0; i < oddArray.length; i++)
		{
			mergeArray[index++]=oddArray[i];
			
		}
		System.out.println("merge Array: ");
		for (int i = 0; i < mergeArray.length; i++)
		{
			System.out.print(mergeArray[i]+" ");
		}

	}

}
