package Day10301practis;

public class ArrayList2 {
	int a[];
	int index=0;
	ArrayList2()
	{
		a=new int[3];
		
	}
	ArrayList2(int size)
	{
		a=new int[size];
	}
	void print()
	{
		for (int i = 0; i < index; i++) 
		{
			System.out.println(a[i]);
		}
		
	}
	void add(int num)
	{
		if(a.length==index)
		{
			int b[]=new int[2*a.length];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			
		
			a=b;
		
		a[index]=num;
		index++;
		}
		else
		{
			a[index]=num;
		index++;
			
		}
		
	}
	int remove(int i)
	{
		for (int j = i; j < index-1; j++) 
		{
			a[j]=a[j+1];
			
		}
		return a[i];
		
	}
	int size()
	{
		return index;
	}
   boolean contain(int num)
   {
	   for (int i = 0; i < index; i++) {
		if(a[i]==num)
		{
			return true;
		}
	}
	   return false;
   }
   
   int indexOf(int num)
   {
	   for (int i = 0; i < index; i++)
	   {
		if(a[i]==num)
		{
			return i;
		}
	}
	   return -1;
   }
   
   int lastIndexOfv1(int num)
   {
	 int  returnvar=-1;
	   for (int i = 0; i < index; i++) {
		if(a[i]==num)
		{
			returnvar=i;
		}
	}
	   return returnvar;
   }
   int lastIndexOfv2(int num)
   {
	   for (int i = index-1; i >=0; i--) 
	   {
		if(a[i]==num)
		{
			return i;
		}
	}
	   return -1;
   }
   void add(int i,int num)
   {
	 if(i<0||i>index)
	 {
		 System.out.println("not possible");
	 }
	 else
	 {
		 if(a.length==index)
			{
				int b[]=new int[2*a.length];
				for (int j = 0; j < a.length; j++) 
				{
					b[j]=a[j];
				}
				
			
				a=b;
			
			
			}
		 for (int j = index; j >i ; j--)
			{
				a[j]=a[j-1];
			}
	 }
	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList2 a=new ArrayList2();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(10);
		a.print();
		//method 2
		//a.remove(2);
	//	a.print();
		//method 3

//		System.out.println(a.size());
//		//method 4
//		System.out.println(a.contain(40));
//		//method 5
//		System.out.println(a.indexOf(20));
//		//method 5
//		System.out.println(a.lastIndexOfv2(10));
//		//method 6
//		System.out.println(a.lastIndexOfv1(10));
		a.add(1, 25);
		a.print();





	}

}
