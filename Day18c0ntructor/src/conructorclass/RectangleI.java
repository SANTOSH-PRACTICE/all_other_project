package conructorclass;

public class RectangleI {

	int length,breadth;
	RectangleI()
	{
		length=0;
		breadth=0;
	}
	
	
	RectangleI(int side)
	{
		
		length=side;
		breadth=side;
	}
	
	RectangleI(int length,int breadth)
	{
		
		this.length=length;
		this.breadth=breadth;
		
	}
	
	void area()
	{
		int area=length*breadth;
		System.out.println("Area:"+area);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		new RectangleI().area();
		new RectangleI(12).area();
		new RectangleI(10,20).area();

	}

}
