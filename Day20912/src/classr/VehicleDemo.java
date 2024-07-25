package classr;

class Vehicle
{
	String vName,vModel,stationname;
	float price;
	Vehicle()
	{
		vName="maruti";
		vModel="800";
		
		stationname="sangli";
		price=50000;
	}
	String display()
	{
		return vName+" "+vModel+" "+stationname+" "+price;
	}
}
class Bike extends Vehicle
{
	float discountRate;
	Bike()
	{
		vName="bajaj";
		vModel="platina";
		
		stationname="sangli";
		price=60000;
		discountRate=0.10f;
	}
	float discount()
	{
		return price *discountRate;
	}
}
public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		System.out.println("Discount: "+b.discount());
		System.out.println(b.display());
	}
}
