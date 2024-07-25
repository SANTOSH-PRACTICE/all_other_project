package Practis;

abstract class Vehicle
{
	abstract void  wheelCount();
}
class Car extends Vehicle
{
public void wheelCount() {
		
		System.out.println("no of wheel is 4");
	}
}
class Truk extends Vehicle
{
	public void wheelCount() {
		System.out.println("no of wheel is 6");
	}
}
public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.wheelCount();
		Truk t=new Truk();
		t.wheelCount();

	}

}
