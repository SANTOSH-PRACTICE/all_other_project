package practisSiglyLinkedList;

public class MySinglyLinkedList
{
	Node root;
	
	public String toString()
	{
		String s="";
		Node temp=root;
		while(temp!=null)
		{
			s=s+temp.data+" ";
			temp=temp.next;
		}
		return  s;
	}
	int[] toArray()
	{
		int a[]=new int[size()];
		Node  temp=root;

		int index=0;
		while(temp!=null)
		{
			a[index]=temp.data;
			temp=temp.next;
			index++;
		}
		return a;
	}
	int size()
	{
		Node temp=root;
		int index=0;
		while(temp!=null)
		{
			temp=temp.next;
			index++;
		}
		return  index;

	}
	void set(int i,int data1)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
	     Node temp=root;
	     int index=0;
	     while(temp!=null)
	     {
	    	 if(index==i)
	    	 {
	             temp.data=data1;
	             return;
	    		 
	    	 }
	    	 	temp=temp.next;
	    	 	index++;
	     }
	}
	
	int get(int i)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
	     Node temp=root;
	     int index=0;
	     while(temp!=null)
	     {
	    	 if(index==i)
	    	 {
	    		return   temp.data;
	    		 
	    	 }
	    	temp=temp.next;
	    	index++;
	     }
	    throw new IndexOutOfBoundsException();
		
	}
	
	void remove(int i)
     	{
		if(i<0)
			throw new IndexOutOfBoundsException();
		if(i==0)
		{
		root=root.next;
			return;
		}
		Node temp=root;
		int index=0;
		while(temp.next!=null)
		{
			if(index==i-1)
			{
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
			index++;
			
		}
		
		
	   
	}
	
	void add(int i,int data)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
		
		if(i==0)
		{
			Node obj=new Node(data);
			obj.next=root;
		      root=obj;
			return;
		}
		Node temp=root;
		int index=0;
		while(temp.next!=null)
		{
			if(index==i-1)
			{
				Node obj=new Node(data);
				obj.next=temp.next;
				temp.next=obj;
				return;
				
			}
				
				temp=temp.next;
				index++;
			
		}
		throw new IndexOutOfBoundsException();
		
	}
	void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void add(int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return;
		}
		else
		{
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
		
		
	}

}
