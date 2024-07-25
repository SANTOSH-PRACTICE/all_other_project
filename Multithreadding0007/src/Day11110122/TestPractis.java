package Day11110122;
class Numbers extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <5; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
public class TestPractis {

	public static void main(String[] args) 
	{
		Numbers n1=new Numbers();
		n1.setName("Child thrad 1");
		
		Numbers n2=new Numbers();
		n2.setName("Child thrad 2");
		n1.start();
		n2.start();
		for (int i = 0; i <5; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}

	}

}
