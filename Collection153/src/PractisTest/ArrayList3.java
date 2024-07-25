package PractisTest;

public class ArrayList3 
{   int a[];

	int index=0;
	void add(int i,int num)
	{
		if(i<0||i>=index)
		{
			System.out.println("not possible");
		}
		if(i>=0&&i<index)
		{for (int j = i; j < a.length; j++) 
		{
			a[j]=a[j-1];
			
			
		}
		a[i]=num;
			
		}
	
	}
	boolean contains(int num)
	{
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
			{
				return true;
			}
		}
		return false;
	}
	
	void print1()
	{
		for (int i = 0; i < index; i++) {
			System.out.println(a[i]);
		}
	}
	ArrayList3()
	{
		a=new int[2];
		
	}
	ArrayList3(int size)
	{
		a=new int[size];
		
	}
	
	
void add(int num)
{
	if(index==a.length)
	{
		int b[]=new int[2*a.length];
		for (int j = 0; j <a.length; j++)
		{
			b[j]=a[j];
			
			
		}
		a=b;
		a[index]=num;
		index++;
	}
	else
	{
		a[index]=num;
		index++;
	}
}
}
