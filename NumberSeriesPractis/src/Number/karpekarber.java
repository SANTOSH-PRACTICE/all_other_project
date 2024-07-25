package Number;

import java.util.Scanner;

public class karpekarber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		int temp=num;
		int squareNum=num*num;
		int count=0;
		
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		
		
		int div=(int) Math.pow(10, count);
		System.out.println(div);
		
		int Ls=(squareNum/div);
		int Rs=(squareNum%div);
		
		int sum=Ls+Rs;
		if(sum==temp)
		{
			System.out.println("kaprekar number");
		}
		else
		{
			System.out.println();
		}
	}

}
