package prelimA4April;

public class Que8 {

	public static void main(String[] args) {

		
		char a[]= {'a','b','c','d','e'};
		char b[]= { 'z','y','x','w','v','f','s'};
		
		int index=0;
		char c[]=new char[a.length+b.length];
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
