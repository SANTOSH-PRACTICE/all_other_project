package basicprogram;

import java.util.Scanner;

public class tranglentype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int side1,side2,side3;
		System.out.println("enter the valve of side1:");
		side1= sc.nextInt();
		
		
		System.out.println("enter the valve of side2:");
		side2= sc.nextInt();
		
		
		System.out.println("enter the valve of side3:");
		side3= sc.nextInt();
		
		if(side1==side2 && side2 == side3)
		{
			System.out.println("the tringle is equilatral");
			
		}
		
		else if ((side1 == side2)|| (side2 == side3)||(side1 == side3))
		{
			System.out.println("the tringle is Isosceles");

		}
		
		else
		{
			System.out.println("the tringle is Scalence");

			
			
		}

		

		

	}

}
