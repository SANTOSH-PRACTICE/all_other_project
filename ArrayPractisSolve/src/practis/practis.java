package practis;

public class practis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = { 1,2,3,2,3 };
//		int cnt = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					cnt++;
//				}
//			}
//		}
//		int b[] = new int[a.length - cnt];
//		int index = 0;
//		for (int i = 0; i < a.length; i++) {
//			int cnt1=0;
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] == a[j])
//				{
//					cnt1++;
//					break;
//				}
//			}
//			if(cnt1==0)
//			{
//				b[index++]=a[i];
//			}
//		}
//		int s=0;
//		int e=b.length-1;
//		while(s<e)
//		{
//			int temp=b[s];
//			b[s]=b[e];
//			b[e]=temp;
//			s++;
//			e--;
//		}
		
		
//			for (int j = 0; j < b.length; j++) {
//				System.out.println(b[j]);
//			}
//			
//		
//		
//		for (int i = 0; i < b.length; i++) 
//		{
//			for (int j = 0; j < b.length; j++) {
//				System.out.println(b[j]+" "+b[i]);
//			}
//			
//		}
		
		
		
//		int [] a= {4,7,4,3,9,2,7,4};
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			int cnt=0;
//			for (int j = i+1; j < a.length; j++)
//			{
//				if(a[i]<a[j])
//				{
//					cnt++;
//				}
//				
//				
//			}
//			if(cnt==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
		
		
//		int[] a= 
//			{
//				3,7,90,20,5,50,40
//			}
//			;
//		int k=3;
//		int index=0;
//		int min=Integer.MAX_VALUE;
//		for (int i = 0; i < a.length-k; i++) 
//		{
//			int sum=0;
//			for (int j = i; j <i+k; j++) 
//			{
//				
//				sum=sum+a[j];
//			}
//			int avg=sum/k;
//			if(avg<min)
//			{
//				min=(sum/k);
//				index=i;
//			}}
//			System.out.println(" min: "+min);
//			System.out.println(" index starts: "+index);
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
		System.out.println(cnt);
		int b[]=new int[a.length-cnt];
		
		int index=0;
		for (int i = a.length-1; i >=0; i--)
		{
			int cnt1=0;
			for (int j =a.length-2; j <i ; j--)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt1==0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
