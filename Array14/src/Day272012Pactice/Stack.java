package Day272012Pactice;

public class Stack {
	int a[]=new int[5];
	int num=0;
	int index=0;
	
	void display()
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void push(int num)
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			System.out.println("Stack is full......");
		}
	}
	int pop()
	 {if(index>0)
	 {
		 num=a[--index];
		 a[index]=0;
		 return num;
	 }
	 else
		 System.out.println("stack is empty: ");
		return 1; 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack a=new Stack();
		a.display();
		System.out.println();
		System.out.println("After push array");
		a.push(12);
		a.display();
		System.out.println();

		a.push(13);
		a.display();
		System.out.println();

		
		a.push(14);
		a.display();
		System.out.println();


		a.push(15);
		a.display();
		System.out.println();


		a.push(16);
		a.display();
		System.out.println();
		System.out.println("after pop array: ");
         a.pop();
         a.display();

	}

}
