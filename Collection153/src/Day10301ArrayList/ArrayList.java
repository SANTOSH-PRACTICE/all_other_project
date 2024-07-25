package Day10301ArrayList;

public class ArrayList  //Arraylist demp class part of this class
{
	//int a[]=new int[3];
    int a[];	
    int index=0;
    
    
    
    public String toString()
    {
    	String s="";
    	for (int i = 0; i < index; i++) {
			s=s+a[i]+" ";
		}
    	return s;
    }
    int []toArray()
    {
    	int b[]=new int[index];
    	for (int i = 0; i < index; i++)
    	{
			b[i]=a[i];
			
		}
    	return b;
    }
    int get(int i)
    {
    	if(i>= 0&& i<index)
    	{
    		return a[i];
    	}
    	else
    		throw new ArrayIndexOutOfBoundsException();
    }
    void set(int i,int num)
    {
    	if(i>=0 && i<index)
    	{
    		a[i]=num;
    		
    	}
    	else
    	{
    		throw new ArrayIndexOutOfBoundsException();
    	}
    }
    void add(int i,int num)
    {
    	if(i<0||i>index)
    	{
    		System.out.println("Not possible");
    	}
    	else
    	{
    		if(index==a.length)
    		{
    			int []b=new int[2*a.length];
    		for(int j=0;j<a.length;j++)
    		{	b[j]=a[j];
    		
    		}
    		a=b;
    		}
    	
    	
    	for (int j = index; j >=i+1; j--) 
    	{
			a[j]=a[j-1];
		}
    	a[i]=num;
    	index++;
     	}	
    }
    int lastIndexOfV2(int num)
    {
    	for (int i = index-1; i >=0 ; i--)
    	{if(a[i]==num)
    		return i;
			
		}
    	return -1;
    }
    int lastIndexOfV1(int num)
    {
    	int returnvalve=-1;
    	for (int i = 0; i < index; i++)
    	{
			if(a[i]==num)
				returnvalve=i;
			
		}
    	return returnvalve;
    }
    int indexOf(int num)
    {
    	for (int i = 0; i < index; i++) 
    	{
			if(a[i]==num)
				return i;
		}
    	return -1;
    }
    boolean contains(int num)
    {
    	for (int i = 0; i < index; i++)
    	{if(a[i]==num)
    		return true;
			
		}
    	return false;
    }
    int size()
    {
    	return index;
    }
    ArrayList()
    {
    	a=new int[3];
    }
    ArrayList(int size)
    {
    	a=new int[size];
    }
    void remove(int i)
    {
    if(i<0)
    {
    	System.out.println("not possible as index is less than zero");
    }
    else if(i>=index)
    {
    	System.out.println("not possible");
    }
    else
    {
    	for (int j = i; j <= index-2; j++)
    	{
			a[j]=a[j+1];
		}
    	index--;
    }
	
	
    }
	void print()
	{
		for (int i = 0; i < index; i++) //index replace the a.length then not element space 0 print in array
		{
			
		
		System.out.println(a[i]);
	}
	}
	void  add(int num)
	{
		if(index==a.length)
		{
			int []b=new int[2*a.length];
			
		
		for (int i = 0; i < a.length; i++)
		{
			b[i]=a[i];
			
		}
		a=b;
		a[index]=num;
		index++;
		
	    }
		else
		{
			//direct add
			a[index]=num;
			index++;
		}
		
	}
		}

