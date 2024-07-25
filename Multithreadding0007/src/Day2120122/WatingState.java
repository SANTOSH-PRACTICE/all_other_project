package Day2120122;
class Choc
{
	int ch=0;
	synchronized void produceChocolate(int n)
	{
		if(ch>=20)
		{
			System.out.println("Producer is wating...");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		ch=ch+n;
		System.out.println("Produced Chocolate "+ch);
		notify();
		
	}
	synchronized void consumedChocolate()
	{
		if(ch<20)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}}
			while(ch>10)
			{
				ch=ch-7;
				System.out.println("After consuming remaing choclate: "+ch);
			}
			notify();
				}
}
class Producer extends Thread
{
	Choc cq;
	public Producer(Choc cq)
	{
		this.cq=cq;
	}
	@Override
	public void run() {
		int count=0;
		while(count<10)
		{
			cq.produceChocolate(10);
			count++;
		}
	}
}
class Consumer extends Thread
{
Choc cq;
public Consumer(Choc cq)
{
	this.cq=cq;
}
@Override
	public void run() {
	while(true)
	{
		cq.consumedChocolate();
	}
}}

public class WatingState {

	public static void main(String[] args) {
Choc cq=new Choc();
Producer p=new Producer(cq);
Consumer c=new Consumer(cq);
p.start();
c.start();

	}

}
