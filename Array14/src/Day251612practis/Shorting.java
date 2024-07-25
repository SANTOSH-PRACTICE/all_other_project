package Day251612practis;

import java.util.Iterator;

public class Shorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array []= {99,67,87,88,45,32};
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length-1; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int x:array)
		{
			System.out.print(" "+x);
		}
	}

}
