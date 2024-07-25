package number;

import java.util.Scanner;

public class karpeternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =sc.nextInt();
		int square=number*number;
		int squarenum=square;
		int len=0;
		int sum=0;
		
		while(squarenum!=0)
		{
			 squarenum=squarenum/10;
			 System.out.println(len);
			 len++;	
		}
		
		int right=0;
		int left=0;
		int j=0;
		for(int i=0;i<len;i++)
		{
			left=square/(int)(Math.pow(10,i));
			right=square%(int)(Math.pow(10,i));
		
			sum=left+right;
			if(sum==number)
			{
				System.out.println("the numbetr is kaprekar number"+number);
				j++;
				
			}
	
		}
			if(j==0)
			{
				System.out.println("the number is not kaprekar number"+number);
			}
			
		

	}
}

