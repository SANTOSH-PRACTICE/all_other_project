package day6class;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		String tech ;
		System.out.println("enter a technology of your choice from the following:");
		System.out.println("C/C++/JAVA/Python/C#");
		tech =sc.next();
		switch(tech)
		
		{
			case "C" : System.out.println("you have selected C");
			          break;
			          
			case "C++" : System.out.println("you have selected C++");
	                     break;
	          
			case "JAVA" : System.out.println("you have selected JAVA");
	                     break;
	          
			case "Python" : System.out.println("you have selected Python");
	                       break;
	          
	          
			case "C#" : System.out.println("you have selected C#");
	                      break;
	                
	          default: System.out.println("you not selected any technology");
	                
		}

	}

}
