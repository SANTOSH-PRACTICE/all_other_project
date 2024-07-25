package day6class;

import java.util.Scanner;

public class swichmaths1 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner( System.in);
		
		int number1,number2;
		
		System.out.println("Enter number1");
		number1= sc.nextInt();
		
		System.out.println("Enter number2");
		number2= sc.nextInt();
		
		System.out.println("Enter opration + / - / * or /:");
		char ch= sc.next().charAt(0);
		switch(ch)
		
		{
		case '+' : System.out.println("The sum is:" +(number1+number2));
		        break;
		        
		case '-' : System.out.println("The sub is:" +(number1-number2));
        break;
        
        
		case '*' : System.out.println("The mul is:" +(number1*number2));
        break;
        
        
		case '/': System.out.println("The div is:" +(number1/number2));
        break;
        
        
        default: System.out.println("Enter correct choice");
		}



	}

}
