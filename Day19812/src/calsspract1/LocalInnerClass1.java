package calsspract1;

public class LocalInnerClass1 {
	int x=244;
	void method1()
	{
		System.out.println("hii from method1...");
		
		class Sample
		{
			int num=20;
		
			
			void m1()
			{
				method2();
				System.out.println("hii from method m1...");
				System.out.println("hi "+num+" "+x);
				
			}
			
		}
		Sample s=new Sample();
		s.m1();
		
		
	}
	void method2()
	{
		System.out.println("hii from method2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass1  a=new LocalInnerClass1();
		a.method1();

	}

}
