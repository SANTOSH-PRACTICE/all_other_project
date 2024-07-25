package practiceday6;

import java.util.Scanner;

public class mathsss {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc =new Scanner(System.in);
		
		int num1,num2;
		System.out.println("enter valve of num1:");
		num1=sc.nextInt();
		
		System.out.println("enter valve of num2:");
		num2=sc.nextInt();
		System.out.println("enter no opration:");
		System.out.println("1.add /  2. sub /3.mul 4.div");
		int choise= sc.nextInt();


		
		
		switch(choise)
		{
		case 1 :System.out.println("addition"+(num1+num2));
		      break;
		      
		case 2 :System.out.println("subtraction"+(num1-num2));
	      break;
	      
	      
		case 3 :System.out.println("multification"+(num1*num2));
	      break;
	      
		case 4 :System.out.println("dividation"+(num1/num2));
	      break;
	      
	      
	      
	      default : System.out.println("choose correct option");
		}

	}

}
