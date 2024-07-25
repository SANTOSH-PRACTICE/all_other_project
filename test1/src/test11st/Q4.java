package test11st;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the side length of triangle:");
	float side =sc.nextFloat();
	
	double area= ( (Math.sqrt(3)/4)*(side*side));
	
	System.out.println("area of triangle:"+area);
	
	
	


	}

}
