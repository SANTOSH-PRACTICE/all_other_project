package inheritance;

class Square{
	int side;
	public Square(int side)
	{
		this.side=side;
		
	}
	int areaOfSquare()
	{
		return side*side;
	}
}
class Rectangle extends Square
{
	int length,breadth;
	public Rectangle(int length,int breadth)
	{
		super(length);
		this.length=length;
		this.breadth=breadth;
		
	}
	int areaOfRectangle()
	{
		return length*breadth;
		
	}
}
class Triangle extends Rectangle
{int side1,side2,side3;
public Triangle(int side1,int side2,int side3)
{
	super(side1,side2);
	this.side1=side1;
	
	this.side2=side2;
	this.side3=side3;
}
int areaOfTriangle()
{
	return(int)(0.5f*side1*side2);
}
	
}

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle(10,2,6);
				System.out.println("area of triangle"+t.areaOfTriangle());
		
            System.out.println( "area of rectangle:"+t.areaOfRectangle());
            System.out.println("area of square:"+t.areaOfTriangle());
	}

}
