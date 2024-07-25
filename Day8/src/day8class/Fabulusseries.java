package day8class;

import java.util.Scanner;

public class Fabulusseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int firstnum,secondnum,nextnum,count;
		System.out.println("enter number upto whitch you want series to get display:");
        int num =sc.nextInt();
        firstnum=0;
        secondnum=1;
        count=0;
        while(count<num)
        {     
        	System.out.print(firstnum +"  ");

        	nextnum=firstnum+secondnum;
        	//System.out.println(firstnum +"  ");

        	firstnum=secondnum;
        	secondnum=nextnum;
        	count++;
        }
	}

}
