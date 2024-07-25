package conructorclass;

public class Vehicle {
	String color;
	int wheelCount;
	int gearCount;
	Vehicle()
	{
		this("red",89);
		System.out.println("1 st constuctor");
	}
	Vehicle(String colour,int gearCount)
	{
		this("green",33,45);
		System.out.println("2 st constuctor");

	}
	
	Vehicle(String colour,int gearCount,int wheelCount)
	{
	
		System.out.println("3 st constuctor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Vehicle();
	}

}
