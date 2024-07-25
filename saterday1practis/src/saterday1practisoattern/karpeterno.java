package saterday1practisoattern;

import java.util.Scanner;

public class karpeterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number your choice:");
		int num=sc.nextInt();
		
		int sqr =num*num;
		int sqrcopy =sqr;
		int j=0;

				System.out.println("square:"+sqr);
		int len=0;
		while(sqrcopy!=0)
		{
			len++;

			sqrcopy=sqrcopy/10;
			System.out.println("lengtht"+len);

		}
		int right=0;
		int left=0;
		for(int i=0;i>len;i++)
		{
			left= sqr / ((int)Math.pow(10, i));
			right= sqr % ((int)Math.pow(10, i))	;	
			
		
		
		if(left + right == num)
		{
			System.out.println("karpetrno"+num);
			j++;
			break;
		}
		}
			if(j== 0)
			{
				System.out.println(" no karpetrno"+num);
	
			}

	
	}
}
