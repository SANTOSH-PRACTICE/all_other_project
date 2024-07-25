package Day2281221practis;

public class ReplaceCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sannnnnntoshnnnnn";
		System.out.println("usinng array");
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]=='n')
			{
				c[i]='m';
			}
		}
		for(char x:c)
		{
			System.out.print(x);
		}
		System.out.println();
		System.out.println("using only string");
		String s2="";
		for (int i = 0; i < s.length(); i++)
		{
			char c1=s.charAt(i);
			
			if(s.charAt(i)=='n')
			{
				c1='m';
				s2=s2+c1;
			}
			else
			{
				s2=s2+c1;
			}
			
		}
		System.out.println(s2);

	}

}
