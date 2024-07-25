package series;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number we want to series:");
		int number=sc.nextInt();
		int fristnum=0;
		int secondnum=1;
		int nextnum=0;
		int count=0;
		System.out.print(fristnum+"  "+secondnum);
		while(count<number)
		{
			nextnum=fristnum+secondnum;
			System.out.print(" "+nextnum);
			fristnum=secondnum;
			secondnum=nextnum;
			count++;
			
		}
		

	}

}
