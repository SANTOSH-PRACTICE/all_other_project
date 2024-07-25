package costructor;

import java.util.Scanner;

public class Trangle {
	
	static int side1,side2,side3;
	void perimeter()
	{
		float perimeter=side1*side2*side3;
		System.out.println("perimer="+perimeter);
		
	}
	void area()
	{
		float area=(0.5f)*(side1*side2);
		System.out.println("Area of triangle:"+area);
	}
	
	void isocelesTriangle()
	{
	float	areaI=(1*side1*side2)/2;
	System.out.println("Area of isoceles triangle="+areaI);
		
	}
	void equilatralTriangle()
	{
	float	areaEQ=(float)((Math.sqrt(3)/4))*(side1*side2);
	System.out.println("Area of equilatral triangle="+areaEQ);
		
	}
	void rightAngleTriangle()
	{
	float	areaRT=(1*side1*side2)/2;
	System.out.println("Area of Right angle triangle="+areaRT);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side1:");
		side1=sc.nextInt();
		
		System.out.println("enter side2:");
		 side2=sc.nextInt();
		
		System.out.println("enter side3:");
		 side3=sc.nextInt();
		
		Trangle t=new Trangle();
		t.perimeter();
         t.area();
         t.isocelesTriangle();
         t.equilatralTriangle();
         t.rightAngleTriangle();

	}

}
