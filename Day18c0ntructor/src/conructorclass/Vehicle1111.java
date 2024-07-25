package conructorclass;

public class Vehicle1111 {
	String color;
	int wheelCount;//contructor call first innermost parameter
	int gearCount;
	Vehicle1111()
	{
		
		color="red";
		wheelCount=4;
		gearCount=6;
		System.out.println("Zero Parameterized constructor");
	}
	Vehicle1111(String colour,int gearCount)
	{
		this();
		System.out.println("color:"+color+" wheel count:"+wheelCount+"gear count:"+gearCount);

	}
	public void main(String[] args) {
		// TODO Auto-generated method stub
		new Vehicle1111();
		new Vehicle1111("blue",4);

	}
	
	
	
	

}
