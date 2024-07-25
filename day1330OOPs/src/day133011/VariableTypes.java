package day133011;

public class VariableTypes {
	int number1; //instance 
	void method1()//non -static method
	{
		System.out.println("method1:"+number1);
	}
	
	void method2() // non-static method
	{
		method1();
	
	System.out.println("method2:"+number1);
		
	}
	public static void main(String[] args) {//static method
		{

		VariableTypes ob= new VariableTypes();
		System.out.println("method1:"+ ob.number1);

          ob.method1();
           ob.method2();
  }
	}
   }