package day6class;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc= new Scanner(System.in);
		
		String tech ;
		System.out.println("Enter a technology of your choice from the following:");
		System.out.println("1.C/ 2.C++  / 3.JAVA / 4.Python/5.C#");
		tech =sc.next();
		
		
		switch(tech)
		
		{
			case "1" : System.out.println("You have selected C");
			          break;
			          
			case "2" : System.out.println("You have selected C++");
	                     break;
	          
			case "3" : System.out.println("You have selected JAVA");
	                     break;
	          
			case "4" : System.out.println("You have selected Python");
	                       break;
	          
	          
			case "5" : System.out.println("You have selected C#");
	                      break;
	                
	          default: System.out.println("You not selected any technology");
	                
		}
	}

}
