package PractisDiply;

public class InsertionSort {

	public static void main(String[] args) {

		
		int a[]= {1,5,9,4,3,7,8,2};
		for (int i = 0; i < a.length; i++) 
		{     int j=i;
	           int temp=a[i];
			for (; j >0; j--) 
			{
				if(a[j-1]>temp)
				{
					a[j]=a[j-1];
				}
				else
					break;
			}
			a[j]=temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
