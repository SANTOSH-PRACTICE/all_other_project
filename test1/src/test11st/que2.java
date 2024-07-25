package test11st;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	
		System.out.println("enter valve of num1:");
	     int	num1 =sc.nextInt();
	     System.out.println("enter valve of num2:");
	     int	num2 =sc.nextInt();
	   
	     System.out.println("befor swaping valve is:"+num1);
	     System.out.println("befor swaping valve is:"+num2);
	     
	     
	     num1 = num1+num2;
	     num2= num1-num2;
	     num1= num1 - num2;
	     
	     System.out.println("after swaping valve is:"+num1);
	     System.out.println("after swaping valve is:"+num2);
	     

	     

	     
	     
	     
	

	


	}

}
