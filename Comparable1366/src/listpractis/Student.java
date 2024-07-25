package listpractis;

public class Student {

	
	
	
		public Student(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String args[])
		{
		int a[]={96,68,12,46,-1};


		int index=0;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]<0)
		{
		cnt++;
		}
		}
		int b[]=new int[a.length-cnt];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>0)
		{
		b[index++]=a[i];
		}
		}
		for(int i=0;i<b.length;i++)
		{
		if(b[i]%10==6&&b[i]<56)
		{
		b[i]=-9;
		}
		else if(a[i]%10==6)
		{
		b[i]=-3;
		}
		else if(b[i]<56)
		{
		b[i]=-7;
		}
		else
		{
		b[i]=b[i];

		}}
		for(int i:b)
		{
		System.out.println(i);
		}
		}
}