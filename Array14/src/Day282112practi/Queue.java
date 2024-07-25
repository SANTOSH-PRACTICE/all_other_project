package Day282112practi;

public class Queue {

	static int size=5;
	static int a[]=new int[size];
	static int rear=0;
	
	static void print() {
	System.out.println("***************************");

	for (int i = 0; i <rear; i++)
	{
		
		System.out.print(a[i]+" ");
	}
		
	}
	static void offer(int num)
	{
			a[rear]=num;
			rear++;
			if(size==rear)
			{
				System.out.println("Queue is full");
			}
		
		
	}
	static void poll()
	{
		for (int i = 0; i < rear-1; i++)
		{
			a[i]=a[i+1];
		}
		rear--;
		if(rear==0)
		{
			System.out.println("Queue is empty");
		}
	}
	
	public static void main(String[] args) {
		offer(12);
		print();
		offer(13);
		print();
		offer(14);
		print();
		offer(15);
		print();
		offer(19);
		print();
		System.out.println("remove: poll");
		poll();
		print();
		poll();
		print();
		poll();
		print();
		poll();
		print();
		poll();
		print();
		poll();
		print();

	}

}
