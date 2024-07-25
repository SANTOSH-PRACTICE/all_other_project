package conructorclass;

public class Rectangle {
	int length,width;
	

	public Rectangle()
	{
		length =12;
		width = 87;
	}
	
	void rectangleArea()
	{
		int area=length*width;
		System.out.println("Area:"+area);
	}
	void rectanglePerimetr()
	{
		int perimeter=2*(length+width);
		System.out.println("perimeter:"+perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.rectangleArea();
		
		new Rectangle().rectanglePerimetr();
		
	}
	

}
