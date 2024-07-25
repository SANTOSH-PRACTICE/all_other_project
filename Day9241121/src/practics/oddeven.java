package practics;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char choice;
		do {
		System.out.println("enter your choice in following:");
		System.out.println("1. prime 2.odd 3.even");
          int n = sc.nextInt();
          switch(n)
          {
        	  case 1: System.out.println("enter num:");
        	  int num=sc.nextInt();
        	  boolean flag=true;
        	  for(int i =2;i<num;i++)
        	  {
        		  if(num % i ==0)
        		  {
        			  flag=false;
        			  break;
        			  
        		  }
        			  
        		  if(!flag)
        		  {
        			  System.out.println("no prime number");
        			  
        		  }
        		  else
        		  {
        			  System.out.println(" prime number");
        		  }
        	  }
        	  break;
    			  
    			  
    			  
    			  case 2:System.out.println("enter number1:");	
    			  int num1=sc.nextInt();
    					  
    				if(num1 % 2 ==0)
    				{
    					System.out.println("number is even");
    				}
    				
    				break;
    				
    			  case 3:System.out.println("enter number2:");	
    			  int num2=sc.nextInt();
    					  
    				if(num2 % 2 !=0)
    				{
    					System.out.println("number is odd");
    				}
    				
    				break;
	
    			  default: System.out.println("enter valid option");
    			  

        		  
        	  }
          System.out.println("do you wish to continue? press(y/n):");
  		choice=sc.next().charAt(0);
	}
  	while(choice =='y');

     
        	  
          }
	}


