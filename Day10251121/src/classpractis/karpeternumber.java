package classpractis;

import java.util.Scanner;

public class karpeternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number:");
		int number=sc.nextInt();
		int square=number*number;
		int copysquare=square;
		int j=0;
		int len=0;
		while(copysquare>0)
		{
		
			copysquare=copysquare/10;
			System.out.println(len);
			len++;
			
		}
		int right=0,left=0;
		for(int i=0;i<len;i++)
		{
		left=square/(int)Math.pow(10,i);
		right=(square%(int)Math.pow(10,i));
		
	
		
		
			if(left+right ==number)
			{
				System.out.println("karpeter number");
				j++;
				break;
			}
		
		}
	
	
	if(	j==0)
	{
		System.out.println("not karpetr no");
	}

	}
}
