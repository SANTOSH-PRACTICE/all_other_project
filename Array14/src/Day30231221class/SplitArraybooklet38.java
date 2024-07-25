package Day30231221class;

import java.util.Arrays;

public class SplitArraybooklet38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,3,6,8,2,9,0,10};
		int decrising[]=new int[a.length];
		int incrising[]=new int[a.length];
		if(a[0]>a[1])
		{
			decrising[0]=a[0];
			incrising[0]=a[1];
		}
		else
		{
			decrising[0]=a[1];
			incrising[0]=a[0];
		}
		int incele=incrising[0];
		int decele=decrising[0];
		int index1=1;
		int index2=1;
		for (int i = 2; i < a.length; i++) 
		{       
			if(a[i]>incele)
			{
				incrising[index1++]=a[i];
				incele=a[i];
			}
			else if(a[i]<decele)
			{
				decrising[index2++]=a[i];
				decele=a[i];
			}
			else
			{
				System.out.println("not found sequence");
				System.exit(0);
			}
		}
		for (int j = 0; j < incrising.length-index2; j++) 
		{
			System.out.print(incrising[j]+" ");
		}
		System.out.println();
		for (int j = 0; j < decrising.length-index1; j++) {
			System.out.print(decrising[j]+" ");
		}

	}}
