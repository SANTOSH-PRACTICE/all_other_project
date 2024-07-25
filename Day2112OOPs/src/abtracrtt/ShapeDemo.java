package abtracrtt;
abstract class Shape
{
	abstract void noOfSide();
	
}
class Trapezoid extends Shape
{
	void noOfSide() {	System.out.println("Tne number of side is 4");

}
}
	
	class Hexagon extends Shape
	{
		void noOfSide() {
		System.out.println("Tne number of side is 6");
		}

	}
		
		class Triangle extends Shape
		{
			void noOfSide() {	System.out.println("Tne number of side is 3");

		}
			}
public class ShapeDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexagon t=new Hexagon();
		t.noOfSide();
		Triangle t1=new Triangle();
		t1.noOfSide();
		
		Trapezoid t2=new Trapezoid();
		t2.noOfSide();
		
		
	}

}
