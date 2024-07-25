package PractisTest;

import Day2040122class.Node;

public class LinkedList<d> 
{
Node1<d> root;
void add(int i,d data)
{ 
	if(i<0)
	throw new IndexOutOfBoundsException();
   if(i==0)
     { Node1<d> obj=new Node1<d>(data);
    obj= root.next;
     obj=root;
     
	 
	   
    }
	
}
void remove(int i)
{ if(i<0)
	throw new IndexOutOfBoundsException();
   if(i==0)
   {
	   root=root.next;
	   return;
	   
   }
   
	int index=0;
	Node1<d>temp=root;
	while(root!=null)
	{
		if(index==i-1)
		{
			if(temp.next==null)
				throw new IndexOutOfBoundsException();

		root.next=root.next.next;
		return;
		}
		temp=temp.next;
		index++;
		
	}
	throw new IndexOutOfBoundsException();
}

void print()
{
	Node1<d>temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	
}
	void add(d data)
	{
		if(root==null)
		{
			root=new Node1<d>(data);
		}
		else
		
		{
			Node1<d> temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node1<d>(data);
			
		}
		
		
		}
	}

