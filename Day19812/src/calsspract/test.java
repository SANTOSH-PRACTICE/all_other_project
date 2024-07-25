package calsspract;

public class test {
	// this is used to pass as an argument in method call
	void method(test x)
	{
		System.out.println("method1 calling:");
	}
	void method2()
	{
		this.method(this);
		System.out.println("method2 calling:");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t1=new test();
		t1.method2();

	}

}
