package practiceday6;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int num1,num2;
		System.out.println("enter the num1:");
		num1= sc.nextInt();
		
		System.out.println("enter the num2:");
		num2= sc.nextInt();
		
		System.out.println("enter the opration perform:");
		System.out.println(" add .1 /   sub.2 / mul.3 / div.4");
		int ch =sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("addition"+  (num1+num2));
		       break;
		       
		case 2 :System.out.println("sutraction"+ (num1-num2));
		        break;
		        
		case 3:System.out.println("multification"+ (num1*num2));
		         break;
		case 4:System.out.println("division"+  (num1/num2));
		         break;
		default:System.out.println("Enter valid option");
		
		         
		
		}
		

		
		

	}

}