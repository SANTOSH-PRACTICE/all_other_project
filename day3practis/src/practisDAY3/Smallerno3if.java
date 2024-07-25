package practisDAY3;

import java.util.Scanner;

public class Smallerno3if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number:");
       int number1 =sc.nextInt();
       
       System.out.println("Enter 2nd number:");
       int number2 =sc.nextInt();
       
       System.out.println("Enter 3rd number:");
       int number3 =sc.nextInt();
       

       
       if(number1<number2)
       {
    	   if(number1<number3)
    	   {
    	   System.out.println(number1 +" is smaller");
    	   }
    	   
      
       }
       
       if(number2<number1)
       {
    	   if(number2>number3)
    	   {
    	   System.out.println(number2 +" is smaller");
    	   }
       }  


       if(number3<number1)
       {
    	   if(number3<number2)
    	   {
    	   System.out.println(number3 +" is smaller");
    	   }
    	   
       }




	}

}
