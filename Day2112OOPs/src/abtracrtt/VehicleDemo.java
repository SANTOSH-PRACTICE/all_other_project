package abtracrtt;

abstract  class Vehicle
{
	abstract void numWheel();
}

 class Car extends Vehicle
{
	

	@Override
	void numWheel() { 
		// TODO Auto-generated method stub
		System.out.println("The number of wheel 4");
	}

}
 class Truck extends Vehicle

 {@Override
	 void numWheel() {
		// TODO Auto-generated method stub
		System.out.println("The number of wheel 6");
 }}
public class VehicleDemo {
	public static void main(String[] args) {
		Car c=new Car();
		c.numWheel();
		
		Truck t=new Truck();
		t.numWheel();
				
	}
}


	

