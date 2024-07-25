package Day4060122MapTree;

public class MyTreeMap {
	Node root;

	 boolean contain(int key)
	{if(root==null)
		return false;
	Node temp=root;
	while(true)
	{
		if(key==temp.key)
		{
			return true;
		}
		else if(key<temp.key&&temp.left==null)
		{
			return false;
		}
		else if(key<temp.key&&temp.left!=null)
		{
			temp=temp.left;
		}
		else if(key>temp.key&&temp.rigth==null)
		{
			return false;
		}

		
		else if(key>temp.key&&temp.rigth!=null)
			
		{
			temp=temp.rigth;
		}
			}
		
	}
	String get(int key)
	{if(root==null)
		return " map is empty";
	Node temp=root;
	while(true)
	{
		if(key==temp.key)
		{
			return temp.valve;
		}
		else if(key<temp.key&&temp.left==null)
		{
			return "not found";
		}
		else if(key<temp.key&&temp.left!=null)
		{
			temp=temp.left;
		}
		else if(key>temp.key&&temp.rigth==null)
		{
			return "not found";
		}

		
		else if(key>temp.key&&temp.rigth!=null)
			
		{
			temp=temp.rigth;
		}
			}
		
	}
	void print()
	{
		printMyNode(root);
		
	}
	
	void printMyNode(Node temp)
	{
		if(temp.left!=null)
			printMyNode(temp.left);
		System.out.println(temp.key+" "+temp.valve);
		if(temp.rigth!=null)
			printMyNode(temp.rigth);
	}
	void add(int key ,String valve)
	{
		if(root==null)
		{
			root=new Node(key,valve);
			return;
		}
		Node temp=root;
		while(true)
		{
			if(key==temp.key)
			{
				temp.valve=valve;
				return;
			}
			else if(key<temp.key&&temp.left==null)
			{
				temp.left=new Node(key,valve);
				return;
			}
			else if(key<temp.key&&temp.left!=null)
			{
				temp=temp.left;
			}
			else if(key>temp.key&&temp.rigth==null)
			{
				temp.rigth=new Node(key,valve);
				return;
			}
			else if(key>temp.key&&temp.rigth!=null)
			{
				temp=temp.rigth;
			}
		}
	}

}
