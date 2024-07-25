package Day2120122;
class Demo
{
	synchronized void m1(int number)   // we used synchronized keyword hence o/p not mixed
	{                           //object level lock
		for (int i = 1; i <=5; i++)
		{
			System.out.println(number+" * "+i+"= "+(number*i));
		}
	}
}
class A extends Thread
{
	Demo demo;
	A(Demo demo)
	{
		this.demo=demo;
		
	}
	@Override
	public void run() {
		demo.m1(5);
	}
}
class B extends Thread
{
	Demo demo;
	B(Demo demo)
	{
		this.demo=demo;
		
	}
	@Override
	public void run() {
		demo.m1(8);
	}
}

public class SynchronizetionObjectLevelLock {

	public static void main(String[] args) {
		Demo demo=new Demo();
		
     A thread1=new A(demo);
     B thread2=new B(demo);
     
     thread1.start();
     thread2.start();
	}

}
