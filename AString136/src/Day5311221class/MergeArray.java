package Day5311221class;

public class MergeArray {

	public static void main(String[] args) {
   char a[]= {'a','b','c','d','e'};
   char b[]= {'z','y','x','w','v','m','k','o'};
   
   
   char c[]=new char[a.length+b.length];
   int index=0;
   for (int i = 0; i < c.length; i++) 
   {
	   if(i<a.length)
	   {
		c[index++]=a[i];
	   }
	   if(i<b.length)
	   {
		   c[index++]=b[i];
		   
	   }
	
   }
   for (int i = 0; i < c.length; i++) {
	   System.out.print(c[i]);
	
}
	}

}
