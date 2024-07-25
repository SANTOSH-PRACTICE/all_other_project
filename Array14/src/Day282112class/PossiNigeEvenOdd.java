package Day282112class;

import java.util.Scanner;

public class PossiNigeEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		System.out.println("Enter element: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
int countEven=0,countOdd=0,countPositive=0,countNegative=0;

for (int i = 0; i < size; i++)
{
	if(a[i]>0)
	{
		countPositive++;
	}
	else 
	{
		countNegative++;
	}
	
}
for (int i = 0; i < size; i++)
{
	if(a[i]%2==0)
	{
		countEven++;
	}
	else
	{
		countOdd++;
	}
}

System.out.println("Positive Number:"+countPositive);
System.out.println("Negative Number:"+countNegative);
System.out.println("Even :"+countEven);
System.out.println("Odd :"+countOdd);

	}

}
