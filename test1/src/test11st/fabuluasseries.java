package test11st;

import java.util.Scanner;

public class fabuluasseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentnum ,priviusnum,nextnum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter we want number series:");
		int num=sc.nextInt();
		currentnum=1;
		
		priviusnum=0;
		int count =0;
		
		
		while(count<num)
		{
			System.out.print(priviusnum+"  ");
			nextnum=priviusnum+currentnum;
			priviusnum=currentnum;
			currentnum=nextnum;
			count++;
			
			
		}

	}

}
