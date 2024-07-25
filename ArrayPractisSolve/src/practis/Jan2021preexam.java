package practis;

public class Jan2021preexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,2,7,5,6};
		int b[]= {9,1,3,4};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]>b[j])
				{
					int temp=a[i];
					a[i]=b[j];
					b[j]=temp;
				}
				
			}
		}
		
		for (int i = 0; i < b.length; i++)
		{
			for (int j = i+1; j < b.length; j++) 
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"  ");
		}
		

	}

}
