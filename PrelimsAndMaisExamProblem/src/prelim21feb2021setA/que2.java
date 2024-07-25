package prelim21feb2021setA;

public class que2 {

	public static void main(String[] args) {
		int a[]= {9,-1,3,6,-6,7,-2,-4,5};
		for (int i = 0; i < a.length; i++)
		{
				for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}	
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
				if(a[i]>=0)
				{
					cnt++;
				}
		}
		System.out.println(cnt);
		
		for (int i = 0; i <cnt; i++) 
		{
			for (int j = i+1; j < cnt; j++)
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
			System.out.print(a[i]+" ");
		}
	}
}
