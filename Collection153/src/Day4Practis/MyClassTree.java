package Day4Practis;

public class MyClassTree
{
Node root;

String get(int key)
{
	if(root==null)
	return "map is empty ";
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
		else if(key>temp.key&&temp.right==null)
		{
			return "not found";
		}
		else if(key>temp.key&&temp.right!=null)
		{
			temp=temp.right;
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
	if(temp.right!=null)
		printMyNode(temp.right);
}
void add(int key,String valve)
{
	if(root==null)
	{
	   root=new Node(key,valve);
	   return;
	}
	Node temp=root;
	
	while(true)
	{
		if( key==temp.key)//1 st
		{
			temp.valve=valve;
			return;
			
		}
		else if(key<temp.key&&temp.left==null) //2nd
		{
			temp.left=new Node(key,valve);
			return;
			
			
		}
		else if(key<temp.key&&temp.left!=null)//3rd
		{
		temp=temp.left;
		}
		else if(key>temp.key&&temp.right==null)//4 rth
		{

			temp.right=new Node(key,valve);
			return;
		}
		else if(key>temp.key&&temp.right!=null)//5th
		{
			temp=temp.right;
			
		}
				
	}
	
}
}
