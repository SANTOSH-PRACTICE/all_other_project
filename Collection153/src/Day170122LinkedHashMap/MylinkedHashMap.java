package Day170122LinkedHashMap;

public class MylinkedHashMap<k,v> 
{
	Node<k,v> root;
	Node<k,v> a[]=new Node[5];
	
	public v get(k key)
	{
		int index=key.hashCode()%a.length;
		Node temp=a[index];
		while(temp!=null)
		{
			if(temp.key==key)
			return (v) temp.value;
			temp=temp.hashMapNext;
			
		}
		return null;
	}
	
	public void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.linkedNext;
		}
	}
	public void add(k key,v value)
	{
		Node<k,v> object=new Node<k,v>(key,value);
				//add hashmap;
		int index=key.hashCode()%a.length;
		if(a[index]==null)
		{
			a[index]=object;
		}
		else
		{
			Node temp=a[index];
			while(temp.hashMapNext!=null)
			
				temp=temp.hashMapNext;
			temp.hashMapNext=object;
		}
		//add in linkedList
		if(root==null)
			root=object;
		else
		{
			Node temp=root;
			while(temp.linkedNext!=null)
			
				temp=temp.linkedNext;
				temp.linkedNext=object;

			
		}
	}

}
