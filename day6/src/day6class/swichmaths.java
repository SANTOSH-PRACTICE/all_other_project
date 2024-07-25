package day6class;

import java.util.Scanner;

public class swichmaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		Scanner sc = new Scanner( System.in);
		
		int number1,number2;
		
		System.out.println("Enter number1");
		number1= sc.nextInt();
		
		System.out.println("Enter number2");
		number2= sc.nextInt();
		
		System.out.println("Enter opration:");
		System.out.println("1. sum  2. sub  3. mul  4.div");
		int choice= sc.nextInt();
		
		switch(choice)
		
		{
		case 1 : System.out.println("The sum is:" +(number1+number2));
		        break;
		        
		case 2 : System.out.println("The sub is:" +(number1-number2));
        break;
        
        
		case 3 : System.out.println("The mul is:" +(number1*number2));
        break;
        
        
		case 4 : System.out.println("The div is:" +(number1/number2));
        break;
        
        
        default: System.out.println("Enter correct choice");
		}


	}

}
