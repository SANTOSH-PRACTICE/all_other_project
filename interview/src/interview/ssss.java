package interview;

import java.util.Scanner;

public class ssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int cnum=num;
		
		int a[]=new int[10];
		int i=0;
		
		while(num!=0)
		{
			int r=num%10;
			
			a[i]=r;
			num=num/10;
			i++;
		}
		
		int index=0;
		int b[]=new int[i];
		for (int j = i-1; j>=0; j--) {
			b[index++]=a[j];
			
		}
		for (int j = 0; j < b.length; j++) {
			System.out.print((char)(64+b[j]));
		}
		System.out.println();
		
		if(i==3)
	{
			System.out.print((char)((cnum/10)+64));
	System.out.print((char)((cnum%10+64)));
	}
		else
		{
	if(i==4)
	{
		System.out.print((char)((cnum/100)+64));
		System.out.print((char)((cnum%100+64)));
		

	}}
	

	}

}
