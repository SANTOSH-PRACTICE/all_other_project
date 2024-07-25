package Day2RecursionArray;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,8,78,98};
		int element=4;
		int count=0;
		count =loopI(0,count,a,element);
				if(count==0)
		{
			System.out.println("elemement not found");
		}

	}

	private static int loopI(int i, int count, int[] a, int element) {
          if(i<a.length)
          {
        	  if(a[i]==element)
  			{
  				System.out.println("element is found:  "+ i+" index");
  				count++;
  			}
        	  i++;
        	 count= loopI(i, count,a,element);
          }
		return count;
	}

}
