package sundaypractice2111;

import java.util.Scanner;

public class equilatral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enrer the valve of side :");
		float side =sc.nextFloat();
		

	int	area = (int)(( Math.sqrt(3)/4)*(side*side));

		System.out.println("area of triangle"+area);
		

	}

}
