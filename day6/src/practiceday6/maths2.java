package practiceday6;

import java.util.Scanner;

public class maths2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner sc =new Scanner(System.in);
		
		int num1,num2;
		System.out.println("enter valve of num1:");
		num1=sc.nextInt();
		
		System.out.println("enter valve of num2:");
		num2=sc.nextInt();
		System.out.println("enter no opration:");
		System.out.println(" + /   -/* or /");
		char choise= sc.next().charAt(0);


		
		
		switch(choise)
		{
		case '+' :System.out.println("addition"+(num1+num2));
		      break;
		      
		case '-' :System.out.println("subtraction"+(num1-num2));
	      break;
	      
	      
		case '*' :System.out.println("multification"+(num1*num2));
	      break;
	      
		case '/' :System.out.println("dividation"+(num1/num2));
	      break;
	      
	      
	      
	      default : System.out.println("choose correct option");
		}

	}

}
