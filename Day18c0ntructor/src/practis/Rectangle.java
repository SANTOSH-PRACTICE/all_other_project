package practis;

public class Rectangle {
	int length,width;
	
	Rectangle()
	{
		length=12;
		width=14;
	}
	
	
  void	rectangleArea()
	{
		int area=length*width;
		System.out.println("area:"+area);
	}
	void rectanglePerimeter()
	{
		int perimeter=2*(length+width);
		System.out.println("perimeter:"+perimeter);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a=new Rectangle();
a.rectangleArea();
a.rectanglePerimeter();
	}

}
