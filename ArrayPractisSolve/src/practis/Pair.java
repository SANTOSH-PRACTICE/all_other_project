package practis;

public class Pair
{
public static void main(String[] args) {
	int a[]= {1,1,2};
	int index=0;
	int b[]=new int[a.length-1];
	for (int i = 0; i < a.length; i++)
	{
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]==a[j])
			{
				b[index++]=a[i];
			}
		}
	}
	b[index]=a[a.length-1];
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[i]+" "+b[j]);
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
}
}
