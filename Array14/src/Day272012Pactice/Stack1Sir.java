package Day272012Pactice;

import java.util.Arrays;

public class Stack1Sir {
	static int a[]=new int[5];
	static int index=0;
	public static void main(String[] args) {
		add(10 );
		print();
		add(20);
		print();
		add(30);
		print();
		add(40);
		print();
		add(50);
		print();
		add(60);
		print();
		System.out.println(remove());
		print();
		System.out.println(remove());
		print();

	}	private static int remove() {
		if(index>0)
		{
		index--;
		int temp=a[index];
		a[index]=0;
		
		return temp;
		}
		else
		{
			System.out.println("array empty: ");
		}
	return 0;
	}
	private static void print() {
  for (int i = 0; i < a.length; i++)
  {
	  
	  System.out.print(a[i]+" ");
	
}	
  System.out.println();

	}
	private static void add(int num) {
		if(index<a.length)
		{
			a[index]=num;
			index++;
		}
		else
		{
			System.out.println("Stack is full...");
		}
		
	}

}
