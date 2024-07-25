package constuctorclass;

import java.util.Scanner;

public class Triangle {
	static int side1,side2,side3;
	void trianglePerimeter ()
	{
		int perimeter=side1+side2+side3;
		System.out.println("Perimeter of Triangle="+perimeter);
	}
	
void triangleArea()
{
	float area=(float)((0.5)*(side1*side2));
	System.out.println("Area Of Triangle="+area);
			
}

void isocelesArea()
{
	float areaI=((1*side1*side2)/2);
	System.out.println("Area of Isoceless Triangle="+areaI);
}

void equilatralArea()
{
	float areaE=(float)((Math.sqrt(3)/4)*(side1*side2));
	System.out.println("Area of Equilatral Triangle="+areaE);
}
void rightAngleArea()
{
	float areaRT=(side1*side2)/2;
	System.out.println("Area of Right Angle triangle="+areaRT);
	
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side1:");
		side1=sc.nextInt();
		
		System.out.println("Enter side2:");
		side2=sc.nextInt();
		
		System.out.println("Enter side3:");
		side3=sc.nextInt();
		Triangle t=new Triangle();
		t.triangleArea();
		t.trianglePerimeter();
		t.isocelesArea();
		t.equilatralArea();
		t.rightAngleArea();
		
		
	}
		
		
	
}
