package TreeMap;

public class MyTreeMap 
{
	
	Node root;
	void print()
	{
		printMyNode(root);
	}
	
	void printMyNode(Node temp)
	{
		if(temp.left!=null)
		{
			 printMyNode(temp.left);
		}
			System.out.println(temp.key+" "+temp.value);
			
		if(temp.right!=null)
		{
				 printMyNode(temp.right);
		}
	}
	
	
	void add(int key,String value)
	{
		if(root==null)
		{
			root=new Node(key,value);
		}
		Node temp=root;
		while(true)
		{
			if(temp.key==key)
			{
				temp.value= value;
				return;
			}
			else if(key<temp.key&&temp.left==null)
			{
				temp.left=new Node(key,value);
				return;
			}
			else if(key<temp.key&&temp.left!=null)
			{   
				temp=temp.left;
				
			}
			else if(key>temp.key&&temp.right==null)
			{
				temp.right=new Node(key,value);
				return;
			}
			else if(key>temp.key&&temp.right!=null)
			{
			     temp=temp.right;	
			}
			
		}
		
	}

}
