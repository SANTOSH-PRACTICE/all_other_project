package day8practis;

import java.util.Scanner;

public class seriesdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int firstnum,secondnum, nextnum ,count;
		System.out.println("Enter the valve of series want ton get display:");
		int num = sc.nextInt();
		firstnum=0;
		secondnum=1;
		count=0;
		
		do {
			System.out.println(firstnum+" ");
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			count++;
		}
		while(count<=num);

	}

}
