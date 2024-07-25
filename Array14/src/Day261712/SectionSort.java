package Day261712;

public class SectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,13,55,22,45,98,34,25,3};
		for (int i = 0; i < a.length; i++)
		{
			int min=i;
			for (int j = i+1; j < a.length; j++)
			{
			if(a[min]>a[j])
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
