package Day3050122class;

public class MyDoublyLinkedList <xyz>
{
   Node<xyz> head;
   Node<xyz> tail;
   //13)to string method
   public String toString()
   {
	   Node<xyz> temp=head;
	   String s="";
	   while(temp!=null)
	   {
		   s=s+temp.data+" ";
		   temp=temp.next;
		   
	   }
	   return s;
   }
   //12)to arrayMethod
   Object [] toArray()
   {
	   Object []a=new Object[size()];
	   Node<xyz>temp=head;
	   int index=0;
	   while(temp!=null)
	   {
		   a[index]=temp.data;
		   temp=temp.next;
		   index++;
	   }
	   
	   
	   return a;
    }
   //11)last index of
   int lastIndexOf(xyz data)
   {
	   int var=-1;
	   Node<xyz>temp=head;
	   int index=0;
	   while(temp!=null)
	   {
		   if(temp.data==data)
		   {
			   var=index;
			   
		   }
		   temp=temp.next;
		   index++;
	   }
	   return var;
   }
   
   //10)index of method
   int indexOf(xyz data)
   {
	   Node<xyz>temp=head;
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
   //9)contain method
   boolean cointans(xyz data)
   {
	   Node <xyz>temp=head;
	 
	   while(temp!=null)
	   {
		   if(temp.data==data)
		   {
			  return true;
		   }
		   temp=temp.next;
		   
	   }
	return   false;
		   
	   
   }
   //8)size method
   int size()
   {
	   Node <xyz>temp=head;
	   int index=0;
	   while(temp!=null)
	   {
		   
		   temp=temp.next;
		   index++;
	   }
	   return index;
		   
   }
   //7)get method
   xyz get(int i)
   {
	   if(i<0)
		   throw new IndexOutOfBoundsException();
	   Node <xyz>temp=head;
	   int index=0;
	   while(temp!=null)
	   {
		   if(index==i)
			   return temp.data;
		   temp=temp.next;
		   index++;
	   }
	   throw new IndexOutOfBoundsException();
   }
   //6)set method
   void set(int i,xyz data)
   {
	   if(i<0)
		   throw new IndexOutOfBoundsException();
	   Node <xyz> temp=head;
	   int index=0;
	   while(temp!=null)
	   {
		   if(index==i)
		   {
			   temp.data=data;
			   return;
		   }
		   
		   temp=temp.next;
		   index++;
		   
	   }
	   throw new IndexOutOfBoundsException();
   }
   
   //5)void add method
   void add(int i,xyz data)
   {
	   if(i<0)
	 throw new IndexOutOfBoundsException();
	   if(i==0)
	   {
		   Node <xyz> obj=new Node<xyz>(data);
		   obj.next=head;
		   head.prev=obj;
		   head=obj;
		   return;
	   }
	   Node<xyz>temp=head;
	   int index=0;
	   while(temp!=null)
	   {
		   if(index==i-1)
		   {
			   if(temp.next==null)
				   throw new IndexOutOfBoundsException();
			   Node <xyz> obj=new Node<xyz>(data);
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
   
   //4)remove method
   void remove(int i)
   {
	   if(i<0)
	   {
		   throw new IndexOutOfBoundsException() ;
	   }
	   if(i==0)
	   {
		   head=head.next;
		   head.prev=null;
		   return;
	   }
	   Node <xyz>temp=head;
	  int index=0;
	  while(temp!=null)
	  {
		  if(index==i-1)
		  {
			  if(temp.next==null)
				  throw new IndexOutOfBoundsException();
			  if(temp.next.next==null)
			  {
				  temp.next=null;
				  tail=temp;
				  return;
			  }
			  else
			  {
				  temp.next=temp.next.next;
				  temp.next.prev=temp;
				  return;
			  }
		  }
		  temp=temp.next;
		  index++;
	  }
	  throw new IndexOutOfBoundsException();
   }
   //3)printrev
   void printRev()
   {
	   Node<xyz> temp=tail;
	   while(temp!=null)
	   {
		   System.out.println(temp.data);
		   temp=temp.prev;
	   }
   }
   //2)printFor
   void printFor()
   {
	   Node<xyz> temp=head;
	   while(temp!=null)
	   {
		   System.out.println(temp.data);
		   temp=temp.next;
	   }
   }
   //1)add method
   void add(xyz data)
   {
	   if(head==null)
	   {
		   head=new Node<xyz>(data);
		   tail=head;
	   }
	   else
	   {
		   Node<xyz>obj=new Node<>(data);
		   tail.next=obj;
		   obj.prev=tail;
		   tail=obj;
	   }
   }
   
}
