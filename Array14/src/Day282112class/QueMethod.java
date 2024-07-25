package Day282112class;

public class QueMethod {
	static int size =5;
	static int arr[]=new int[size];
	static int  front=0,rear=0;
	
	static void printArray()
	{
		System.out.println("*****************");
		for (int i = 0; i < rear; i++)
		{
		System.out.print(arr[i]+" ");	
		}
	}
	static void offer(int num)
	{
		arr[rear]=num;
		rear++;
		if(size==rear)
		{
			System.out.println("queue is full");
		}
	}
	static void poll()
	{
		for (int i = 0; i < rear-1; i++) 
		{
			arr[i]=arr[i+1];
			
		}
		rear--;
		if(rear==0)//rear==0 also used,
		{
			System.out.println("Queue is empty");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		offer(12);
		printArray();

		offer(45);
		printArray();
                             //check add the offer() and check.
		offer(89);
		printArray();

		offer(12);
		printArray();

		offer(13);
		printArray();

		printArray();
		poll();
		printArray();
		poll();
		
		printArray();
		poll();
		printArray();

		poll();
		printArray();

		poll();
		
		printArray();
		
		
		

	}

}
