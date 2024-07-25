package practis;

public class AdditionOfAntiiDia {

	public static void main(String[] args) {
int a[][]= {{1,2,3,4},
		{1,3,4,3},
		{1,3,4,5},
		{1,4,3,5}
        };
int sum=0;
int cnt=0;
for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length; j++)
	{
		if(j+i==3||j-i==0)
		{
		 sum=sum+a[i][j];
			System.out.print(a[i][j]+" ");
			 cnt++;
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
	
}
System.out.println(sum);
	int index=0;

	int b[]=new int[cnt];
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a.length; j++)
		{
			if(j+i==3||j-i==0)
			{
			 
				b[index++]=a[i][j];
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();
	int cnt1=0;
	
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a.length; j++)
		{
			if(j+i==3||j-i==0)
			{
				System.out.print(" ");
			}
			else
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
				 cnt1++;
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	System.out.println(sum);
		int index1=0;

		int b1[]=new int[cnt1];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(j+i==3||j-i==0)
				{
				 
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
					b1[index1++]=a[i][j];
				}
			}
			System.out.println();
			
		}


System.out.println();
for (int i = 0; i < b1.length; i++) {
	System.out.print(b1[i]+" ");
}


}}