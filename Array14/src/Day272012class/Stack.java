package Day272012class;

public class Stack {
	int arr[]=new int[5];
	int index=0;
	int num=0;
	void display()
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
	void push(int num)
	{
		if(index<arr.length)
		{
			arr[index++]=num;
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	int pop()
	{
		if(index>0)
		{
			num=arr[--index];
			arr[index]=0;
			return num;
			
		}
		else
		{
			System.out.println("Stack is empty");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ob=new Stack();
		ob.push(12);
		ob.push(23);
		ob.push(13);
		ob.push(66);
		ob.push(100);
		ob.display();
		System.out.println("*****************");
		ob.pop();//if you can right ob.pop then remove no oftime pop  used remove no element in array.
		
		System.out.println("Array: ");
		ob.display();


	
	}

}
