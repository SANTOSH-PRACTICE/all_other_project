package Day11110122;

class Number11 extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			
		
		System.out.println(Thread.currentThread().getName());
	}
}}

public class PrivarityMethod {

	public static void main(String[] args) {
		
		 Number11 a=new  Number11();
		 a.setName("N1 Thread");
		 a.setPriority(10);
		 a.start();
		 for (int i = 0; i <5; i++) {
				
				
				System.out.println(Thread.currentThread().getName());
			}
		 
	}

}
