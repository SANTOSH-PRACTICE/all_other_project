package Day2120122;
class A90
{
synchronized void first(B90 b90)
	{
	System.out.println("Thread in first() of A90");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	b90.last();
	
	}
synchronized void last()
{
	System.out.println("Thread in last() of A90");
}
}
class B90
{
     synchronized	void first(A90 a90)
    {
       System.out.println("Thread in first() of B90");
      try {
        Thread.sleep(2000);
      }
     catch(InterruptedException e)
      {
	e.printStackTrace();
       }
     a90.last();

       }
     
       synchronized void last()
      {
     System.out.println("Thread in last() of B90");
      }

    }

public class DeadLock extends Thread
{

	A90 thread1=new A90();
	B90 thread2=new B90();
	DeadLock()
	{
		this.start();
		thread1.first(thread2);
	}
	@Override
	public void run() {
		thread2.first(thread1);
	}

	public static void main(String[] args) {
     new DeadLock();
	}

}
