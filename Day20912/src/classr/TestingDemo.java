package classr;
class Test
{
	void display1()
	{
		System.out.println("Good Moring....");
	}
	void display2()
	{
		System.out.println("Good Afternoon....");
	}
}

class TestingInheritance extends Test
{
	void display3()
	{
		System.out.println("Good Evening....");
	}
}


public class TestingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingInheritance a=new TestingInheritance();
		a.display3();
		a.display2();
		a.display1();

	}

}
