package basic;

import java.util.Scanner;

public class chractorisAlphaDigitSim {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charactor:");
		char ch=sc.next().charAt(0);
//		
//		if(ch>='a'&&ch<='z')
//		{
//			System.out.println("lower case alphabate");
//		}
//		else if(ch>='A'&&ch<='z')
//		{
//			System.out.println("Upper case alphabate");
//		}
//		else if(ch>='0'&&ch<='9')
//		{
//			System.out.println("digit");
//		}
//		else
//		{
//			System.out.println("sysmbol");
//		}
//		
		
		if(ch>=65&&ch<=90)
		{
			System.out.println("Upper case alphabate");
		}
		else if(ch>=97&&ch<=122)
		{
			System.out.println("lower case alphabate");
		}
		else if(ch>=48&&ch<=57)
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("symbol");
		}
	}

}
