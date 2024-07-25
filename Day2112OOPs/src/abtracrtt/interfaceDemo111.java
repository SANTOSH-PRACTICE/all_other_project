package abtracrtt;

interface testing{
	
	void method1();
	void method2();

}
class TestingInterface implements testing
{
	public void method1()
	{
		System.out.println("Hii from method1");
	}
	public void method2()
	{
		System.out.println("Hii from method2");
	}
}


public class interfaceDemo111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingInterface t=new TestingInterface();
		t.method1();
		t.method2();
	}

}
