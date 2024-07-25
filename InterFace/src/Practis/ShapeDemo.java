package Practis;

interface I2
{   
  abstract void noOfSides();
  
  
}

class Triangle implements I2
{

	@Override
	public void noOfSides() {
		// TODO Auto-generated method stub
		System.out.println("No of Side is 3");
	}
	
}
class Trapezodal implements I2
{

	@Override
	public void noOfSides() {
		// TODO Auto-generated method stub
		System.out.println("No of Side is 4");
	}
	
}
class Hexagonal implements I2
{

	@Override
	public void noOfSides() {
		// TODO Auto-generated method stub
		System.out.println("No of Side is 6");
	}
	
}
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hexagonal");
		Hexagonal h=new Hexagonal();
		h.noOfSides();
		System.out.println("Triangle");
		Triangle t=new Triangle();
		t.noOfSides();
		System.out.println("Trapezoidal");
		Trapezodal t1=new Trapezodal();
		t1.noOfSides();

	}

}
