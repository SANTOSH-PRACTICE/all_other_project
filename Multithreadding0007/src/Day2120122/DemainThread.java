package Day2120122;
class MyThread extends Thread
{
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+" Says Hii");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
public class DemainThread {

	public static void main(String[] args) {
		 MyThread t=new  MyThread();
		 System.out.println("Before: "+t.isDaemon());
		// System.out.println(Thread.currentThread().isDaemon());
		 t.setDaemon(true);
		 System.out.println("After: "+t.isDaemon());
		 t.start();
	}

}
