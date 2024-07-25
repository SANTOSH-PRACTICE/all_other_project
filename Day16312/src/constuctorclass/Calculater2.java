package constuctorclass;

import java.util.Scanner;

public class Calculater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Calculator a=new Calculator();
		Scanner sc =new Scanner(System.in);
		do {
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("1. addition 2. subtraction 3.multification 4.divion");
		 choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Addition:"+a.addition(num1, num2));;
		        break;
		        
		case 2:System.out.println("Subtraction:"+a.subtraction(num1, num2));
		        break;
	    case 3:System.out.println("Multification:"+a.multification(num1, num2));
		        break; 
	    case 4:System.out.println("Divion:"+a.division(num1, num2));
		        break;
		  default: System.out.println("Enter valid option(1-4):");      
		        
		}
		}
		while(choice<=4);
		

	}

}
