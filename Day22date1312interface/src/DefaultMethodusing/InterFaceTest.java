package DefaultMethodusing;
interface I11
{
	void method1();
	void method2();
	static void fly()
	{
		System.out.println("flyying...");
	}
}
class A1 implements I11
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("A Method 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("A Method 2");

	}
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Default Caliing");
	}
	
	
}
class B1 implements I11{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("B Method 1");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("B Method 2");

	}
	
	
}

public class InterFaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       A1 a=new A1();
       a.method1();
       a.method2();
       a.fly();
       
       B1 b=new B1();
       b.method1();
       b.method2();
   //    b.fly();
       
	}

}
