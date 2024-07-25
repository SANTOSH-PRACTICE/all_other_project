package mathamaticsSS;

import java.util.Scanner;

public class RECTANGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			Scanner sc =new Scanner(System.in);
			float length,breadth;
			
			System.out.println("enter the length of the rectangle:");
			//int length =sc.nextInt();
			float len=sc.nextFloat();

			System.out.println("enter the breadth of the rectangle:");
			//int breadth =sc.nextInt();
			float bre=sc.nextFloat();
			
			// int area = length*breadth;
			 float area = len*bre;

				System.out.println("area is:" +area);
				//int perimeter=2*(length+breath);
				 float perimeter=2*(len+bre);
					System.out.println("perimetris:" +perimeter);
					


	}

}
