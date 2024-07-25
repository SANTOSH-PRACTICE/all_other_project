package test2;

import java.util.Scanner;

public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int side1,side2,side3;
		System.out.println("enter valuve of side 1:");
		side1=sc.nextInt();
		System.out.println("enter valuve of side 2:");
		side2=sc.nextInt();
		System.out.println("enter valuve of side 3:");
		side3=sc.nextInt();
		
		if ((side1 == side2) && (side2 == side3))
		{
			System.out.println("triangle is equilatral");
		}
		else if ((side1 == side2) && (side2 != side3) && (side1 == side3))
		{
			System.out.println("triangle is isosceles");
		}
		
		else
		{
			System.out.println("triangle is scalence");
		}
		

	}

}
