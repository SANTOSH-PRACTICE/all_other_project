package methodjava;

import java.util.Scanner;

public class Calculater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater a=new Calculater();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		
        System.out.println("Enter number1:");
       int num1=sc.nextInt();
       
       System.out.println("Enter number2:");
      int  num2=sc.nextInt();
      System.out.println("Enter following option:");
      System.out.println("1.addition 2.subtraction 3.multification 4.division 5.quit");
      choice=sc.nextInt();
       
      
      switch(choice)
      {
      case 1 :System.out.println("addition:"+a.addition(num1, num2));
              break;
              
      case 2 :System.out.println("subtraction:"+a.subtraction(num1,num2));
      break;
      
      
      case 3 :System.out.println("multification:"+a.multification(num1, num2));
      break;
      
      case 4 :System.out.println("divion:"+a.divion(num1, num2));
      break;
      case 5:System.out.println("***EXITING***");
             break;
     default:System.out.println("Enter valid option");
             break;
      
      }
		}   
	
		while(choice <=4);
		
		}

		
		
	}

