package Day261712Practis;

public class BubbleShorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,8,5,6,4,9,7,2};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			
		
		System.out.print(" "+a[i]);
	}}

}
