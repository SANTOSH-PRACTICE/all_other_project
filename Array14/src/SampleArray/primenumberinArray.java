package SampleArray;

public class primenumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,2,3,4,5,6,7,11};
		int cnt1=0;
		for (int i = 0; i < a.length; i++) 
		{int cnt=0;
		
			
			for (int j =2; j < a[i]; j++)
			{
				if(a[i]%j==0)
				{
					cnt++;
				}
				
			}
			if(cnt==0)
			{
				cnt1++;
			}
			
		}
		int d[]=new int[a.length-cnt1];
		int c[]=new int[a.length-d.length];

		int index=0;
		int index1=0;
		for (int i = 0; i < a.length; i++) 
		{int count=0;
			
			for (int j =2; j < a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				c[index++]=a[i];
			}
			else
			{
				d[index1++]=a[i];
				
			}
		}
		System.out.println("not prime number: ");
		for (int x:d) 
		{
			System.out.print(x+" ");
		}
		System.out.println("prime number : ");
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
		
			

	}

}
