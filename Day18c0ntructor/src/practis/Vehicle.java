package practis;

public class Vehicle {
String color;
int wheelCount,gearCount;

Vehicle()
{
	this("red",45);
	System.out.println("1 st constructor");
}
Vehicle(String string,int num)
{
	this("green",56,67);
	System.out.println("2 nd contructor");
}
Vehicle(String string,int num,int num2)
{
	System.out.println("3 rd contractor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a=new Vehicle();

	}

}
