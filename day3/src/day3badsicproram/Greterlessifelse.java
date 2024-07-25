package day3badsicproram;

import java.util.Scanner;

public class Greterlessifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number:");
       int number1 =sc.nextInt();
       
       System.out.println("Enter 2nd number:");
       int number2 =sc.nextInt();
       
       System.out.println("Enter 3rd number:");
       int number3 =sc.nextInt();
       

       
       if((number1>number2)&&(number1>number3))
       {
    	   
    	   System.out.println(number1 +" is greter");
       }   

       else    if ((number2>number1)&&(number2>number3))
       {
    	   
    	   System.out.println(number2 +" is greter");
       }   

       else 
       {
    	   if((number1>number2)&&(number1>number3))
           {
        	   
        	   System.out.println(number3 +" is greter");
           }   


       }
    	   
       }


	

}
