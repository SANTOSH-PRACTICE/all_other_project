package Day2120122;

  class Demo1
{
	synchronized static void m1(int number)//class level used
	{for(int i=1;i<=5;i++) {
		System.out.println(number+" * "+i+" = "+(number*i));
	}}
}
class A1 extends Thread
{
	@Override
	public void run() {
		Demo1.m1(5);
	}
}

class B1 extends Thread
{
	@Override
	public void run() {
		Demo1.m1(8);
	}
}

public class SynchronizedClassLevelLock {

	public static void main(String[] args) {
A1 thread1=new A1();
B1 thread2=new B1();
thread1.start();
thread2.start();

	}

}
