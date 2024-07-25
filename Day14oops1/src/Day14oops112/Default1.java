package Day14oops112;

public class Default1 {
	
	int a;
	static int  m;
	
	void method1()
	{
		System.out.println("hi from method");
	}
	Default1()
	{
		System.out.println("hi from contractor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default1 t=new Default1();
		t.method1();

		System.out.println(t.a+" "+t.m);

	}

}
