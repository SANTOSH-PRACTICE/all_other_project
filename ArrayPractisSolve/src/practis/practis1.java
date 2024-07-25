package practis;

public class practis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] a= {'a','b','c','d','e','f','g'};
//		char[] b= {'w','x','y','z'};
//		char []c=new char[a.length+b.length];
//		int index=0;
//		for (int i = 0; i < a.length; i++) 
//		{
//			if(i<a.length)
//			{
//				c[index++]=a[i];
//			}
//			if(i<b.length)
//			{
//				c[index++]=b[i];
//			}
//			
//		}
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(c[i]+" ");
//		}
//		int[] a= {5,1,3,4,7};
//		int num=12;
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = i+1; j < a.length; j++) 
//			{
//				for (int k = j+1; k < a.length; k++) 
//				{
//					if((a[i]+a[j]+a[k])<num)
//					{
//						System.out.println(a[i]+" "+a[j]+" "+a[k]);
//					}
//				}
//			}
//		}
		int[] a= {1,2,3,4,5,6,7,8};
		int sum=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			cnt++;
			
		}
		System.out.println(sum);
		double avg=sum/cnt;
		System.out.println(avg);

	}

}
