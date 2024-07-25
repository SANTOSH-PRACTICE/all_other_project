package Day2RecursionArray;

public class SumOfArray {

	public static void main(String[] args) {
      int a[]= {1,2,3,4,5,6,7,8,9};
      int sum=0;
      sum=loopI(0,a,sum);
     
      System.out.println(sum);
      print(0,a);
      
	}

	private static void print(int i, int[] a) {
		if(i<a.length)
		{
		System.out.println(a[i]);
		i++;
		print(i,a);
	}
	}
	private static int loopI(int i, int[] a, int sum) {
		if(i<a.length)
		{
			sum=sum+a[i];
			i++;
			sum=loopI(i, a, sum);
			
		}
		
		return sum;
	}

}
