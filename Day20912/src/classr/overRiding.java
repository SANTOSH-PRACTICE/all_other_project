package classr;
class Test34
{
	void display1()
	{
		System.out.println("Good Morinng....");
	}

}

class TestingInheritance1 extends Test34
{
	void display1()
	{
		System.out.println("Good Evening....");
	}
}


public class overRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingInheritance a=new TestingInheritance();
		a.display1();



}}
