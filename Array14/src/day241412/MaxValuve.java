package day241412;

public class MaxValuve {
	public static void main(String[] args) {
		int [] a= {1,2,3,0,4,5,8,12,7};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
