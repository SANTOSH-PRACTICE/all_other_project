package DefaultMethodusing;

interface I1
{
	void method1();
	void method2();
	default void fly() {
		System.out.println("Flyiinggg");
	}
}
class A implements I1{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("A method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("A method2");
	}
		
		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("Default  method calling ");

	}
	
}

class B implements I1
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("B method1");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("B method2");

	}
	
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		B ob1=new B();
		
		ob.method1();
		ob.method2();
		ob.fly();
		
		ob1.method1();
		ob1.method2();
		//ob1.fly();  this method is default  hence the ob1.fly ans is "flyiiingg" [check ans ob1.fly() applying]

	}

}
