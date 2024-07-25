package san;

public class ArrayList2 {
	int []a=new int[5];
	int index=0;
	
		
	
	boolean contains(int num)
	{
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
			{
				return true;
			}
		}
		return false;
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
		
		 if(index==a.length)
			 
		 {
			 int b[]=new int[2*a.length];
			 for(int i=0;i<index;i++)
			 {
				 b[i]=a[i];
				 index++;
				
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
	


}
