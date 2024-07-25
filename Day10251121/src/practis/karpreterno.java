package practis;

import java.util.Scanner;

public class karpreterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int temp=num;
		int square =num*num;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
			
		}
		
		int div =(int) Math.pow(10,count);
		
		int firstpart =square/div;
		int secondpart =square%div;
		
		
		if((firstpart+secondpart)==num )
	   {
			System.out.println( num+" karpreter no");
		}
		else
		{
			System.out.println( num+"is not karpreter no");
		}

	}

	

}
