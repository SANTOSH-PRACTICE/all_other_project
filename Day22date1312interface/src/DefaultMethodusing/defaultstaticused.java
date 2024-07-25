package DefaultMethodusing;
interface I2
{
	void method1();
	void method2();
	static void fly() {
		System.out.println("Flyiinggg");
	}
}
class D implements I2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("D method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("D method2");
	}
		
		
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("Default  method calling ");

	}
	
}

class C implements I2
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("C method1");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("C method2");

	}
	
}

public class defaultstaticused {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob=new D();
		C ob1=new C();
		
		ob.method1();
		ob.method2();
		ob.fly();
		
		ob1.method1();
		ob1.method2();
	     I2.fly();    //we used static method and  hence the in class fly method 
	                   //   can not excute hence we used interface(I2 fly()

	}

}
