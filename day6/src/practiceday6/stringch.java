package practiceday6;

import java.util.Scanner;

public class stringch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char tech;
		System.out.println("Enter the choice off folloewing:");
		System.out.println("a.C / b.C++ / c.JAVA  / d.Python");
		
         	tech= sc.next().charAt(0);
		
	switch(tech)
		{
	case 'a' :System.out.println("You are selected C prgramming");
	     break;
	
	case 'b' :System.out.println("You are selected C++ prgramming");
             break ;  
	case 'c' :System.out.println("You are selected JAVA prgramming");
               break;
	case 'd' :System.out.println("You are selected Python prgramming");
             break;
             
    default: System.out.println("choose valid option");
    
    
		}
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
		

	

}
