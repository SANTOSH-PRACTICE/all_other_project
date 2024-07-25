package dsdddddad;

import java.util.Iterator;

public class Number43
{

	public static void main(String[] args)
	{
		int count=5;
		for (int i = 0; i <5 ; i++)
		{
			int count1=0;
			for (int j = 0; j <5 ; j++)
			{
				if(j-i<=0)
				{
					System.out.print(count+count1);
					count1++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			count--;
		}
	}
}
