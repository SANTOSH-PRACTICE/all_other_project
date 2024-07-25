package Seies;

import java.util.Scanner;

public class PelliSeris {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter first number: ");
	     int firstnum=sc.nextInt();
	     System.out.println("Enter second number: ");
	     int secondnum=sc.nextInt();
	    
	     System.out.print(firstnum+" "+secondnum);
	     
	     for (int i = 0; i < 15; i++) 
	     {
	    	 int nextnum=firstnum+2*secondnum;
	    	 System.out.print(" "+nextnum);
	    	 firstnum=secondnum;
	    	 secondnum=nextnum;
		}
	}

}
