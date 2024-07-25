package Day10301practis;

public class ArrayList1 
{
int a[];
int index=0;
public String toString()    // method12
{
	String s="";
	for (int i = 0; i < index; i++) 
	{
		s=s+a[i]+" ";
	}
	return s;
	
}
int []toArray()      //method 11;
{
	int b[]=new int[index];
	for (int i = 0; i < b.length; i++) 
	{
		b[i]=a[i];
		
	}
	return b;
	
}
int get(int i)            //method 10;
{
	if(i>0&&i<index)
	{
		return a[i];
	}
	else
	{
		throw new ArrayIndexOutOfBoundsException();
	}
}
void set(int i,int num)         //method 9
{  if(i>0&&i<index)
	a[i]=num;
else
{
	throw new ArrayIndexOutOfBoundsException();
}
}
void add(int i,int num)   //method 8
{
	if(i<0||i>index)
	{
		System.out.println("not possible");
	}
	else
	{
		if(index==a.length)
		{
			int b[]=new int[2*a.length];
			for (int j =0; j <index ; j++)
			{
				b[j]=a[j];
			}
			a=b;
		}
		for (int j = index; j >i ; j--)
		{
			a[j]=a[j-1];
		}
		a[i]=num;
		index++;
	}
}
int lastIndexOfV2(int num)   //method 7
{
	for (int i = index-1; i>=0; i--)
	{
		if(a[i]==num)
		{
			return i;
		}
	}
	return -1;
}

int lastIndexOfV1(int num)   //method 6
{
	int returnVar=-1;
	for (int i = 0; i < index; i++) 
	{
		if(a[i]==num)
		{
			returnVar=i;
		}
	}
	return returnVar;
	
}

int indexOf(int num)       //method5
{
	for (int i = 0; i <index; i++) 
	{
		if(a[i]==num)
		{
			return i;
		}
	}
	return -1;
}
boolean contains(int num)    //method4
{
	for (int i = 0; i < index; i++) 
	{
		if(a[i]==num) 
		{
			return  true;
		}
		
	}
	return false;
}
int size()      //method 3
{
	return index;
}

void remove(int i)        //method 2
{
	if(i<0)
	{
		System.out.println("not possible index less than zero");
	}
	else if(i>=index)
	{
		System.out.println("Not possible ");
	}
	else if(i==index-1)
	{
		a[index-1]=0;
		index--;
	}
	else {
	for (int j = i; j < index-1; j++)
	{
		a[j]=a[j+1];
	}
	}
}

void print()
{
	for (int i = 0; i < index; i++) 
	{
		System.out.println(a[i]);
		
	}
}

ArrayList1()
{
	a=new int[3];
	
}
ArrayList1(int size)
{
	a=new int[size];
}
void add(int num)          //method 1
{
	if(index==a.length)
	{
		int b[]=new int[2*a.length];
		for (int i = 0; i < index; i++) 
		{
			b[i]=a[i];
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
