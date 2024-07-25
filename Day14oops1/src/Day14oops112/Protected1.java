package Day14oops112;

public class Protected1 {
	
	protected int a;
	protected static int  m;
	
	protected void method1()
	{
		System.out.println("hi from method");
	}
	protected Protected1()
	{
		System.out.println("hi from contractor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected1 t=new Protected1();
		t.method1();

	}

}
