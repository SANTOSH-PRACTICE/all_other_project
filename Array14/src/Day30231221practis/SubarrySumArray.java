package Day30231221practis;

public class SubarrySumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,7,90,20,5,50,40};
		int index=0;
		int k=3;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < k; i++)
		{
			int sum=0;
			for (int j = i; j <i+k; j++)
			{
			sum=sum+a[j];
			}
		
			int avg=sum/k;
			index=i;
		
		if(avg<min)
		{
			min=(sum/k);
			index=i;
		}
		}
		System.out.println(" min: "+min);
		System.out.println(" index starts: "+index);

	}}
