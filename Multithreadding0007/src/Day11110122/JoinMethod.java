package Day11110122;
class Numb extends Thread
{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
		System.out.println(Thread.currentThread().getName());
	}}
}

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		 
   Numb a=new Numb();
   a.setName("N1 Thread");
   a.start();
   a.join();
   for (int i = 0; i < 5; i++) {
		
		
		System.out.println(Thread.currentThread().getName());
	}
   
	}

}
