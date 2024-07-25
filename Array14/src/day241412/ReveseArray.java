package day241412;

public class ReveseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,5,4,6,7,12,76};
		int start=0;
		int end =a.length-1;
		
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	    }
      }
