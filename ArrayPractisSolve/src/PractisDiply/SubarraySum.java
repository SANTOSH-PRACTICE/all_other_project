package PractisDiply;

public class SubarraySum 
{
public static void main(String[] args)
{
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
		System.out.println(sum +" "+avg);
		if(avg<min)
		{
			min=avg;
			index=i;
			
		}
		
		
	}
	System.out.println(min +" "+ index);
}
}
