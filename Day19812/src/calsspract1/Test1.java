package calsspract1;



 class Test2 {

	Test1 t1;
	Test2(Test1 t1)
	{
		this.t1=t1;
	}
	void display()
	{
		System.out.println("Calling from Test Class...");
		System.out.println(t1.test2Variable+" "+t1.name);
	}
 }
 public class Test1
 { 
	int test2Variable=200;
	String name="RANI";
	
	{
	Test2 test2=new Test2(this);
	test2.display();
	System.out.println("Test1 consructor calling ....");
	
	}
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test1 t2 =new Test1();
		}
 }
 
