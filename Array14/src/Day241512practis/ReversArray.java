package Day241512practis;

public class ReversArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,3,5,7,9,4,5,7,2};
		
		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++)
		{if(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
			
		}
		}	
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
