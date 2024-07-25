package Day2RecursionArray;

public class Elementfound {

	public static void main(String[] args) {
     int a[]= {1,2,34,5,34,65,23};
     int count=0;
     int element=1;
     count=loopI(0,a,element,count);
    
     if(count==0)
     {
    	 System.out.println("element not found");
     }
	}

	private static int loopI(int i, int[] a, int element, int count) {
		if(a[i]==element)
		{
			System.out.println("element is found");
			count++;
			
		}
		i++;
		return count;
	}

}
