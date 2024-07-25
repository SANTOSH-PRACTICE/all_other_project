package Day11110122;

class Numbers3 extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class SllepingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers3 n1=new Numbers3();
		n1.setName("N1 Thread");
		n1.start();
		
		for (int i = 0; i < 5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		}
				

	

}
