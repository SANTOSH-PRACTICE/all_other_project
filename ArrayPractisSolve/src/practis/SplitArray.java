package practis;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,3,6,8,2,9,0,10};
		int[]b=new int[a.length];
		int []c=new int[a.length];
		
		if(a[0]>a[1])
		{
			b[0]=a[0];
			c[0]=a[1];
		}
		else
		{
			b[0]=a[1];
			c[0]=a[0];
		}
		int indexin=1;
		int indexde=1;
		for (int i = 2; i < a.length; i++) 
		{
			
				if(b[0]>a[i])
				{
					b[indexin++]=a[i];
				}
				
				
				else if(c[0]<a[i])
				{
					c[indexde++]=a[i];
				}
				else
				{
					System.out.println("element not found");
				}
	     }
		for (int i = 0; i < b.length-indexde; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < c.length-indexin; i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
