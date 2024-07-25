package inheritance;

class sample
{
	void method1()
	{
		System.out.println("good moring");
	}
}

class Sample1 extends sample
{
	void method1()
	{
		System.out.println("good afternoon");
	}
}

public class MetodRidingding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1 m=new Sample1();
		m.method1();
		
	

	
	}

	

}
