package mathamaticsSS;

import java.util.Scanner;

public class TRIANGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of an equilatral triglre:");
	int side = sc.nextInt();
		//float side = sc.nextInt();
		int area = (int) ((Math.sqrt(3)/4)*(side*side));
	//	float area = (float) ((Math.sqrt(3)/4)*(side*side));

			System.out.println("area of an equilatral trigle is::" +area);


	}

}
