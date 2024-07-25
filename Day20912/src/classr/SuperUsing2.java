package classr;
class Sample13
{
	int num1=56;
	
}

public class SuperUsing2 extends Sample13 {
	int num1=99;
	void display()
	{
		System.out.println(num1 +" "+super.num1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperUsing2 t=new SuperUsing2();
		t.display();

	}

}
