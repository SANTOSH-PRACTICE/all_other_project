package Seies;

import java.util.Scanner;

public class FabonaciSeris {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number: ");
     int firstnum=sc.nextInt();
     System.out.println("Enter second number: ");
     int secondnum=sc.nextInt();
     System.out.println("enter the num of series req:");
     int num=sc.nextInt();

     
     System.out.print(firstnum+" "+secondnum);
     
     
     while(num!=0)
     {
    	 int nextnum=firstnum+secondnum;
    	 System.out.print(" "+nextnum);
    	 firstnum=secondnum;
    	 secondnum=nextnum;
    	 num--;
     }
	}

}
