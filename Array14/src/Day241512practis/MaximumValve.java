package Day241512practis;

public class MaximumValve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,4,7,3,8,9,4};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println("maximum valve: "+max);

	}

}
