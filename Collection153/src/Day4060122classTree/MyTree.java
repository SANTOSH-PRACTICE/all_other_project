package Day4060122classTree;

public class MyTree {
   Node root;
   void print()
   {
	   printMyNode(root);
   }
   void printMyNode(Node temp)
   {
	   if(temp.left!=null)
		   printMyNode(temp.left);
	   System.out.println(temp.data);
	   if(temp.right!=null)
		   printMyNode(temp.right);
   }
	void add(int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return;
		}
		Node temp=root;
		while(true)
		{
			if(data==temp.data)//1 st
			{
				return;
			}
			else if(data<temp.data &&temp.left==null)//2nd
			{
				temp.left=new Node(data);
				return;
			}
			else if(data<temp.data &&temp.left!=null)//3rd
			{
				temp=temp.left;
			}
			else if(data>temp.data &&temp.right==null)//4rth
			{
				temp.right=new Node(data);
				return;
			}
			else if(data>temp.data &&temp.right!=null)//5th
			{
				temp=temp.right;
			}
		}
	}
}
