package test11st;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		int radius= sc.nextInt();
		
		float area =(3.14f*(radius*radius));
		System.out.println("area of cicle"+area);
		
		float perimeter=(2*3.14f*radius);
		System.out.println("perimeter of circle"+perimeter);
		
		

	}

}
