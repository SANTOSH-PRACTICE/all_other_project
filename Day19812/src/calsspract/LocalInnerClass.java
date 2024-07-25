package calsspract;

public class LocalInnerClass {
	int x=10;
	void method1()
	{
		System.out.println("Hii from method1");
		class Sample{
			int num1=10;
			void m1()
			{
				method2();
				System.out.println("hii" + num1 + " " +x);
			}
		}
		Sample s= new Sample();
		s.num1=12;
		s.m1();
		
	}
	void method2()
	{
		System.out.println("method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass t= new LocalInnerClass();
		t.method1();
		
	}
}
