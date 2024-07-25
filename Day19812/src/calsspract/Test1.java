package calsspract;
//object refrance

class Test2{
	Test1 t1 ;
	Test2(Test1 t1)
	{
		this.t1=t1;
	}
	void display()
	{
		System.out.println("Calling from Test Class...");
		System.out.println(t1.testVariable+" "+t1.name);
	}
}
public class Test1
{
	int testVariable=200;
	String name="Teena";
	Test1(){
	Test2 test=new Test2(this);
	test.display();
	System.out.println("Test1 consructor calling ....");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 =new Test1();
	}
}
