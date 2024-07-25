package Day5PractisHashMap;

public class MyHashMap<k,d> 
{
Node a[]=new Node[5];
int index=0;
boolean contain(k key)
{
	int index=key.hashCode()%a.length;
	Node temp=a[index];
	while(temp!=null)
	{
		if(temp.key==key)
			return true;
		temp=temp.next;
	}
	return false;
}
int size()
{
	int size=0;
	for (int i = 0; i < a.length; i++) 
	{
		Node temp=a[i];
		while(temp!=null)
		{
			size++;
			temp=temp.next;
		}
		
	}
	return size;
}


void print()
{
	for (int i = 0; i < a.length; i++) 
	{
		Node temp=a[i];
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.next;
		}
		
	}
}
void add(k key,d value)
{
	int index= key.hashCode() % a.length;
	if(a[index]==null)
	{
		a[index]=new Node<k,d>(key,value);
		return;
		
	}
	Node temp=a[index];
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=new Node<k,d>(key,value);
}
}
