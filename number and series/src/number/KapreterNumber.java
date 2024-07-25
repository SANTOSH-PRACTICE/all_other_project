package number;

import java.util.Scanner;

public class KapreterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int square=num*num;
		int copysq=square;
		int len=0;
		
		while(copysq>0)
		{
			copysq=copysq/10;
			System.out.println(len);
			len++;
			
		}
	int	right=0;
	int	left=0;
	int j=0;
	int sum=0;
	for(int i=0;i<len;i++)
	{
		left=square/(int)(Math.pow(10, i));
		right=square%(int)(Math.pow(10, i));
		sum=right+left;
		
		if(sum==num)
		{
			System.out.println("number is kapretr"+num);
			j++;
		}

	}
	if(j==0)
	{
		System.out.println("number is not kapreter");
	}

	}

}
