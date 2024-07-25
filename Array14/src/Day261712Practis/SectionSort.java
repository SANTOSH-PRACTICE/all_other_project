package Day261712Practis;

public class SectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,2,6,3,76,23,5,32};
	      for (int i = 0; i < a.length; i++)
	      {
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	      for (int i = 0; i < a.length; i++) 
	      {
			System.out.print(" "+a[i]);
		}

	}

}
