package calsspract;
class test3
{
	void display()
	{
		System.out.println("Hii from display ...");
	}
	test3 m1()
	{
		System.out.println("In m1()");
		return this;
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test3().m1().display();

	}

}
