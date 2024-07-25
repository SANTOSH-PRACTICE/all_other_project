package classr;
class Sample12
{
	void display()
	{
		System.out.println("Hii from Sample");
	}
}

public class SuperUsing1 extends Sample12 {
	void display()
	{
		super.display();
		System.out.println("Hii from SuperUsing1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperUsing1 t=new SuperUsing1();
		t.display();
		

	}

}
