package day6class;

import java.util.Scanner;

public class ifelserposini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in)  ;    
		
		int number;
		
		System.out.println("Enter a number your choice:");
		
		number = sc.nextInt();
		if (number > 0)
		{
			System.out.println(number +  "  is positive number");
		}
		
		else if(number<0)
		{
				
			System.out.println(number +  "  is negative number");

	}
		else
		{
			System.out.println("Enter value is zero");
			
		}
		
			
		}
		
		
		

}
