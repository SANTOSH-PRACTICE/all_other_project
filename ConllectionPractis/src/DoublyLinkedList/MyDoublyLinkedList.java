package DoublyLinkedList;

import java.lang.reflect.InaccessibleObjectException;

public class MyDoublyLinkedList 
{

	Node head;
	Node tail;
	int [] toArray()
	{
		int a[]=new int[size()];
		
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			a[index]=temp.data;
			temp=temp.next;
			index++;
		}
		return a;
	}
	boolean contain(int data)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
		
	}
	int size()
	{
		Node temp=head;
		int index=0;
		
		while(temp!=null)
		{
		
			temp=temp.next;
		index++;
			
			
		}
		return index;
		
	}
	public String toString()
	{
		String s="";
		Node temp=head;
		while(temp!=null)
		{
			s=s+temp.data+" ";
			temp=temp.next;
			
		}
		return s;
		
	}
	int indexof(int data)
	{
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
	
	int lastIndexOf(int data)
	{
		int var=-1;
		  Node temp=head;
          int index=0;
          while(temp!=null)
          {
        	  if(temp.data==data)
        	  {
        		 var= index;
        	  }
        	  
        	  temp=temp.next;
        	  index++;
        	  
          }
          return var;
		
	}
	int get(int i)
	{
		if(i<0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			Node temp=head;
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
		}
		throw new IndexOutOfBoundsException();
	}
	
	void set(int i,int data)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
          Node temp=head;
          int index=0;
          while(temp!=null)
          {
        	  if(index==i)
        	  {
        		  temp.data=data;;
        	  }
        	  
        	  temp=temp.next;
        	  index++;
        	  
          }
		
		
			
	}
	
	void remove(int i)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
		if(i==0)
		{
			head.prev=null;
			head=head.next;
			return;
		}
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			if(index==i-1)
			{
				if(temp.next==null)
				{
					throw new IndexOutOfBoundsException();
				}
				else if(temp.next.next==null)
				{
					temp.next=null;
					temp=tail;
					return;
				}
				else
				{
					temp.next=temp.next.next;
					temp=temp.next;
					return;
				
				}
				
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
			obj.next=head;
			head.prev=obj;
			head=obj;
			
			return;
					
		}
		else
		{
			Node temp=head;
			int index=0;
			while(temp!=null)
			{
				if(index==i-1)
				{
					if(temp.next==null)
						throw new IndexOutOfBoundsException();
				Node obj=new Node(data);
				temp.next.prev=obj;
				obj.next=temp.next;
				obj.prev=temp;
				temp.next=obj;
				return;
					
				}

				temp=temp.next;
				index++;
			}
		}
	}
	
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void add(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			tail=head;
		}
		else
		{
			Node obj=new Node(data);
			tail.next=obj;
			obj.prev=tail;
			tail=obj;
		}
	}
}
