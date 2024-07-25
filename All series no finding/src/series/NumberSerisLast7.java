package series;

import java.util.Scanner;


public class NumberSerisLast7 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number above 100(excluded100):");
	int num=sc.nextInt();

	
	System.out.println("Enter the number1 above 100(excluded 200):");
	int num1=sc.nextInt();
	
	for(int i=num;i<num1;i++)          //for(int i=100;i<200;i++)
	{
		if(i%10 == 7)
		{
			System.out.println(i);
		}
	}



}}