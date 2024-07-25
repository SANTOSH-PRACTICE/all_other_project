package Day30231221class;

public class SubarraySumIndex {

	public static void main(String[] args) {//booklet 25
		// TODO Auto-generated method stub
		int a[]= {3,7,90,20,5,50,40};
		int k=3;
		int index=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k; i++) 
		{
			int sum=0;
			for (int j = i; j <i+k; j++) 
			{
				
				sum=sum+a[j];
			}
			int avg=sum/k;
			if(avg<min)
			{
				min=(sum/k);
				index=i;
			}}
			System.out.println(" min: "+min);
			System.out.println(" index starts: "+index);

		

	}

}
