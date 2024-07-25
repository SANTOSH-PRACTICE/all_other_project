package prelim21feb2021setA;

public class Que3 {

	public static void main(String[] args) {

		int a[]= {3,7,90,20,5,50,40};
		int k=3;
		int index=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-2; i++) 
		{
			int sum = 0;
			for (int j = i; j < i+k; j++)
			{
				
				sum=sum+a[j];
			}
			if(min>sum)
			{
				min=sum;
				index=i;
			}
		}
		System.out.println("minimum avg :"+min/k  +"index:"+index);

	}


}
