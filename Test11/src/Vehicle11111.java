import conructorclass.Vehicle1111;

public class Vehicle11111 {

	String color;
	int wheelCount;//contructor call first innermost parameter
	int gearCount;
	Vehicle11111()
	{
		
		color="red";
		wheelCount=4;
		gearCount=6;
		System.out.println("Zero Parameterized constructor");
	}
	Vehicle11111(String colour,int gearCount)
	{
		this();
		System.out.println("color:"+color+" wheel count:"+wheelCount+"gear count:"+gearCount);

	}
	public void main(String[] args) {
		// TODO Auto-generated method stub
		new Vehicle11111();
		new Vehicle11111("blue",4);

	}
	
	
	
	
	}

}
