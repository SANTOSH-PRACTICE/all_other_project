package Day11110122;
class Number1 extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) 
		{
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class YieldMethod {

	public static void main(String[] args) {
		 Number1 n=new  Number1();
		 n.setName("N1 thread");
		 n.start();
		 for (int i = 0; i < 5; i++) 
		 {
				System.out.println(Thread.currentThread().getName());

		}

	}

}
