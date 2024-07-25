package Day282112class;

public class CharactorMergingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'a','b','c','d','e'};
		char b[]= {'z','x','y','v','u'};
		char c[]=new char[a.length+b.length];
		
		int index=0;
		int index2=0;
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++)
		{
			if(i%2==0)
			{
				c[i]=a[index];
				index++;
			}
			else
			{
				if(index2<b.length)
				{
				c[i]=b[index2];
				index2++;
				}
				else
				{
					
				}
			}
		}
for (int i = 0; i < c.length; i++)
{
	System.out.print(" "+c[i]);
}

	}

}
