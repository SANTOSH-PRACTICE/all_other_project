package calsspract1;

class Test3
{  
	ObjectRefrance test;
	
	public Test3(ObjectRefrance test)
	{
		this.test=test;
	}
	
	void display()
	{
		System.out.println("hello from test class");
		System.out.println("rahul"+test.a+" "+test.x);
	}
	
}

public class ObjectRefrance {
	int x=2000;
	String a="sun";
	{	Test3 s=new Test3(this);

		s.display();
		System.out.println("hello from class object");
	}
	
	

	public static void main(String[] args) {

		ObjectRefrance s=new ObjectRefrance();
	
	}

}
