package calsspract1;

 class test6
{
	void display()
	{
		System.out.println(" hello from class test3");
	}
	test6 m1()
	{
		System.out.println("hello from m1");
		return(this);
		
	}
	
}



public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new test6().m1().display();

	}

}
