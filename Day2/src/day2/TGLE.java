package day2;

import java.util.Scanner;

public class TGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of an equilatral triglre:");
		int side = sc.nextInt();
		
		int area = (int) ((Math.sqrt(3)/4)*(side*side));
		
			System.out.println("area of an equilatral trigle is::" +area);
			

		
		

	}

}
