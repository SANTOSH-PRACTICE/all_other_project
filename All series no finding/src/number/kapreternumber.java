package number;

import java.util.Scanner;

public class kapreternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
	     num=sc.nextInt();
		
		int square=num*num;
		int temp=num;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		
		int div = (int)Math.pow(10, count);
		int firstnum=(square/div);
		int secondnum=(square%div);
		if(firstnum+secondnum==temp)
		{
			System.out.println("kapreter number:"+temp);
		}
		else
		{
			System.out.println("not kapreter number:"+temp);
		}
	}

}
