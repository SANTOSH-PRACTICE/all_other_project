package classr;

class test1{     //parent class
	int x=10;
	static int y=90;
	void method1()
	{
		System.out.println("hii from method1");
	}
}

public class Oppsuse extends test1 {   //child class
	void method2 ()
{
		System.out.println("hello from method2");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oppsuse s=new Oppsuse();
		System.out.println(s.x+" "+s.y);
		s.method1();
		s.method2();

	}

}
