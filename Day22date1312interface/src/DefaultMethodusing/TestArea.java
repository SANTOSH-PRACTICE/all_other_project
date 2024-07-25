package DefaultMethodusing;
class Square
{
	int side;
	Square(int side)
	{
		this.side=side;
	}
	float area()
	{
		float area=side*side;
		return area;
	}
}
class Rectangle11 extends Square
{  int length,breadth;
	
	Rectangle11(int length,int breadth)
	{
		super(breadth);
		this.length=length;
		this.breadth=breadth;
	}
	 float area()
	 {
		 float area=length*breadth;
		 return area;
	 }
	
}
class Triangle extends Rectangle11
{
	int side1,side2,side3;
	Triangle(int side1,int side2,int side3)
	{
		super(side1,side2);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	float area() {
		float area=(0.5f)*(side1*side2);
		return area;
	}
}

public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square(12);
		System.out.println("area of Square:" +s.area());
		
		Rectangle11 r=new Rectangle11(12,14);
		System.out.println("area of rectangle:"+r.area());
		
		Triangle t=new Triangle(12,13,16);
		System.out.println("area of Triangle:"+t.area());
	
	}

}
