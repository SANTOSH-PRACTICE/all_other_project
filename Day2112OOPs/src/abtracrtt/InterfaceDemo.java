package abtracrtt;
interface I1{
	void method1();
	
}
interface I2{
	void method2();
	
}
interface I3 extends I1 ,I2{
	void method3();
	
}

public class InterfaceDemo implements I3 {

	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hii from m1");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Hii from m2");

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Hii from m3");

	}
	public static void main(String[] args) {
		InterfaceDemo v=new InterfaceDemo();
		v.method1();
		v.method2();
		v.method3();
	}

}
