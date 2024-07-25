package LinkedList;

public class myLInkedLIst {

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
		return s;
	}
	int [] toArray()
	{
		int a[]=new int[size()];
		Node temp=root;
		int index=0;
		while(temp!=null)
		{
			a[index]=temp.data;
			temp=temp.next;
			index++;
		}
		return a;
		
	}
	
	int lastIndexOf(int data)
	{
		int var=-1;
		Node temp=root;
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
	int indexOf(int data)
	{
		Node temp=root;
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
	boolean contains(int data)
	{
		Node temp=root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
			index++;
		}
		return false;
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
		return index;
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
				return temp.data;
			}
			temp=temp.next;
			index++;
			
		}
		throw new IndexOutOfBoundsException();
	}
	void set(int i,int data)
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
		while(temp!=null)
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
		while(temp!=null)
		{
			if(index==i-1)
			{
					 Node obj = new Node(data);
					obj.next=temp.next;
					temp.next=obj;
					return;
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
			root=root.next;
			return;
		}
		Node temp=root;
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
		}
		 
		else {
		Node temp=root;
		while(temp.next!=null)
		{
			
			temp=temp.next;
		}
		
		temp.next=new Node(data);
		}
	}
}
