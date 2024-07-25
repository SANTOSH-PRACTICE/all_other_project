package saterday1practisoattern;

import java.util.Scanner;

public class KapreterNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int square=number*number;
		int temp=number;
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}

		int div=(int) Math.pow(10, count);
		int firstnum=square/div;
		int secondnum=square%div;
		int sum=firstnum+secondnum;
		
		if(temp==sum)
		{
			System.out.println("number is kapreter: "+temp);
		}
		
		else
		{
			System.out.println("number is  not kapreter: "+temp);

		}
	}

}
