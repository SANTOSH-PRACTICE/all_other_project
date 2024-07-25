package Day2040122class;

public class MyLinkedList<d> {

	Node <d>root;
	public String toString()
	{
		String s="";
		Node <d>temp=root;
		while(temp!=null)
		{
			s=s+temp.data+" ";
			temp=temp.next;
		}
		return s;
	}
	//11)to array method
	Object[] toArray()
	{
		Object[] a =new Object[size()];
		Node <d>temp=root;
		int index=0;
		while(temp!=null)
		{
			a[index]=temp.data;
			temp=temp.next;
			index++;
		}
		return a;
		
	}
	//10)size
	int size()
	{
		int index=0;
		Node <d>temp=root;
		while(temp!=null)
		{
			
			temp=temp.next;
			index++;
		}
		return index;
		
	}
	//9)add method(i,data)
	void add(int i,d userData)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
		if(i==0) {
			Node obj=new Node<d>(userData);
			obj.next=root;
			root=obj;
			return;
		}
		Node <d>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(index==i-1)
			{
				Node<d> obj=new Node<d>(userData);
				obj.next=temp.next;
				temp.next=obj;
				return;
			}
			temp=temp.next;
			index++;
		}
			
	}
	//8)remove method
      void remove(int i)
      {
    	  if(i<0)
    		  throw new IndexOutOfBoundsException();
    	  if(i==0)
    	  {
    		  root=root.next;
    		  return;
    	  }
    	  Node <d>temp=root;
    	  int index=0;
    	  
    	  while(temp!=null)
    	  {
    		  if(index==i-1)
    		  {
    			  if(temp.next==null)
    				  throw new IndexOutOfBoundsException();
    			  temp.next=temp.next.next;
    			  return;
    		  }
    		  temp=temp.next;
    		  index++;
    		  
    	  }
    	  throw new IndexOutOfBoundsException();
      }

	//7)lastindexOf method
	int lastIndexOf(d userData)
	{
		int abcd=-1;
		Node <d>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==userData)
			{
				abcd=index;
			}
			temp=temp.next;
			index++;
		}
		return abcd;
	}
		//6)index of method
	int indexOf(d userData)
	{
		Node <d>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==userData)
			{
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
	//5)contain method
	boolean contains(d userData)
	{
		Node <d>temp=root;
		while(temp!=null)
		{
			if(temp.data==userData)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	//4)set method
	void set(int i,d userData)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
		Node <d>temp=root;
		int index=0;
		while(temp!=null)
			{
			if(i==index)
			{
				temp.data=userData;
				return;
			}
			temp=temp.next;
			index++;
		}
		throw new IndexOutOfBoundsException();
	}
	
	//3)get method
	d get(int i)
	{
		if(i<0)
		throw new IndexOutOfBoundsException();
		Node <d>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(index==i)
			{
				return temp.data;
			}
			temp=temp.next;
			index++;
		}
		throw new IndexOutOfBoundsException();
	}
	//2)print method
	void print()
	{
	Node<d> temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
	//1)add method
	void add(d data)
	{
		if(root==null)
		{
			root=new Node<d>(data);
		}
		else
		{
			Node<d> temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node<d>(data);
		}
	}
}
