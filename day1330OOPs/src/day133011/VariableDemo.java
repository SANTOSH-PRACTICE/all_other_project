package day133011;

public class VariableDemo {
	//static -static(accessible)
	//non-static -non -static(accessible)
	//static member from non- static contex-(accessible)
	//non static member from  static contex-(object req)

	static int number1=12;//static
	int number2=76;      //non static
	static void method1()
	{
		System.out.println("number1 :"+number1);
		
	}
	void method2()
	{
		System.out.println("number1:"+VariableDemo.number1);
		System.out.println("number2:"+number2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo a1=new VariableDemo();
		a1.method1();
		a1.method2();
		
		

	}

}
