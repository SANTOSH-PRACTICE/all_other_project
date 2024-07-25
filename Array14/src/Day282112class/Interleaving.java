package Day282112class;

import java.util.Arrays;

public class Interleaving {

	public static void main(String[] args) {
		
		char a[]= {'a','b','c','d','e'};
		char b[]= {'z','x','y','v','u','q','d','h'};
		char c[]=new char[a.length+b.length];
		
//		int len=0;
//		if(a.length>b.length)
//			len=a.length;
//		else
//			len=b.length;
//		
//		System.out.println(len);
		int index=0;
		for (int i = 0; i <c.length; i++) 
		{
			if(i<a.length)
			{
				c[index]=a[i];
				index++;
			}
			if(i<b.length)
			{
				c[index]=b[i];
				index++;
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(" "+c[i]);
		}

	}

}
