package Day2RecursionArray;

public class BubbleSort {

	public static void main(String[] args) {
      int a[]= {1,43,12,35,67,86,2};
     
      loopI(0,a);
     
		print(0,a);
	
	}

	private static void print(int i, int[] a) {
	if(i<a.length)
	{
		System.out.println(a[i]);
		i++;
		print(i, a);
	}
	}

	private static void loopI(int i, int[] a) {
		
		if(i<a.length)
		{
			
			loopJ(i,i+1,a);
			i++;
			loopI(i, a);
			}
		}
	private static void loopJ(int i, int j, int[] a) 
	{
		if(j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;

			loopJ(i, j, a);
						
		}
	}
}
