package PractisDiply;

public class MaximumMinimum {

	public static void main(String[] args) {
     
		int a[]= {3,2,5,1,16,56,88,23};
		
		int min=Integer.MAX_VALUE;
		int max=0;
		
		for (int i = 0; i <a.length; i++) 
		{
				if(a[i]>max)
				{
					max=a[i];
				}
				if(a[i]<min)
				{
					min=a[i];
				}
				
				
			
			
		}
		System.out.println(max);
		System.out.println(min);
		
	             
		}
}
