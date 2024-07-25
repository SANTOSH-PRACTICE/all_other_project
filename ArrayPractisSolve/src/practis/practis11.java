package practis;

public class practis11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= 
			{
				1,3,5,6,2,3,4,5,97,1,23,
			}
			;
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
		}
		
		int b[]=new int[a.length-cnt];
		int index=0;
		for (int i =0; i<a.length;i++)
		{
			int cnt1=0;
			for (int j = 0; j <b.length; j++)
			{
				if(a[i]==b[j])
				{
					cnt1++;
				}
			}
			if(cnt1==0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}

	}

}
