package Day2281221c;



public class ReplaceCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adsdddddghgggjhgdddd";
		System.out.println("using array");
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]=='d')
			{
				c[i]='f';
			}
		}
		for(char n:c)
		{
			System.out.print(n);
		}
		/*********************/
		
		System.out.println();
		System.out.println("*********************");
		System.out.println();
		System.out.println("without using array");

		String s2="";
		for (int i = 0; i < s.length(); i++) 
		{
		char c1=s.charAt(i);
			if(s.charAt(i)=='d')
			{
				c1='f';
				s2=s2+c1;
				
			}
			else
			{
				s2=s2+c1;

			}}
		System.out.println(s2);
	    }
     }
