package basicprogram;

import java.util.Arrays;

public class ddsddfsfaffsf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=
			{
				23,45,67,88,90
			}
			;
			int num=90;
			int start=0;
			int end=a.length-1;

		int mid=0;
		while(start<=end)
		{
			mid=start+end/2;
			if(a[mid]==num)
			{
				System.out.println("found");
				break;
			}
			else if(a[mid]<num)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(start>end)
		{
			System.out.println("not found");
		}
		// System.out.println(in);
	}

}
