package Day11110122;
class Numbers1 implements Runnable
{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

public class TestInterfaceUseg {

	public static void main(String[] args) {
Numbers1 n1=new Numbers1();
Thread t1=	new Thread(n1);

	t1.start();
	for (int i = 0; i < 5; i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
}
}