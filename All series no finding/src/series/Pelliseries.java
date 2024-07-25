package series;

import java.util.Scanner;

public class Pelliseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int previusnum=0;
		int currentnum=1;
		int nextnum=0;
		System.out.print(previusnum+" "+currentnum);
		for(int i=0;i<15;i++)
		{
			nextnum=previusnum+(2*currentnum);
			System.out.print(" "+nextnum);
			previusnum=currentnum;
			currentnum=nextnum;
		}

	}

}
