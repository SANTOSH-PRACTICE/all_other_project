package MaptreePractis;

public class MyMapTree 
{
	Node root;
	
	void print()
	{
		System.out.println();
	 printOfNode(root);
	}
	
	void printOfNode(Node temp)
	{
		if(temp.left!=null)
			printOfNode( temp.left);
			
			System.out.println(temp.data);
		if(temp.right!=null)
			printOfNode(temp.right);
	}
	
	void add(int data)
	{
		if(root==null)
		{
			root=new Node(data);
		}
		Node temp=root;
		while(true)
		{
			if(temp.data==data)
			{
				return;
			}
			else if(data<temp.data&&temp.left==null)
			{
				temp.left=new Node(data);
				return;
				
			}
			else if(data<temp.data&&temp.left!=null)
			{
				
				temp=temp.left;
			}
			else if(data>temp.data &&temp.right==null)
			{
				temp.right=new Node(data);
				return;
				
			}
			else if(data>temp.data&&temp.right!=null)
			{
				
				temp=temp.right;
			}
		}
	}

}
