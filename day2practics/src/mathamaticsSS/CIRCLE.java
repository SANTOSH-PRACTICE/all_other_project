package mathamaticsSS;

import java.util.Scanner;

public class CIRCLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		int radius=sc.nextInt();
		
     int area=(int) (3.14*(radius*radius));
		System.out.println("enter the area of circle:"+area);
		
		int perimeter=(int) (2*3.14*radius);
		System.out.println("enter the perimetr of circle:"+perimeter);


     
	}

}
