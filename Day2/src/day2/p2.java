package day2;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of the rectangle:");
		int length =sc.nextInt();
		
		System.out.println("enter the breadth of the rectangle:");
		int breadth =sc.nextInt();
		 int area = length*breadth;
			System.out.println("area is:" +area);
			
			 int perimeter=2*(length+breadth);
				System.out.println("perimetris:" +perimeter);
				
				

			

		

		
		

	}

}
