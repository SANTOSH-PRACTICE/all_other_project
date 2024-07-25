package StringPractis;

public class RemoveSpaceBetweenString {

	public static void main(String[] args) {

		String s="     Santosh     is       my    name   ";
		 s=s.trim();
			int index=0;
			int cnt=0;
			for (int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i)==' ')
				{
					cnt++;
				}
			}

		System.out.println(s);
		System.out.println(cnt);
		String sa[]=new String[cnt+1];
		for (int i = 0; i < s.length(); i++)
		{
			String s1="";
			int indexj=0;
			
			for (int j = i; j <s.length(); j++) 
			{
				if(s.charAt(j)!=' ')
				{
					s1=s1+s.charAt(j);
				}
				else
				{
					 indexj=j;
					 break;
				}
				
				if(j==s.length()-1)
				{
					indexj=j;
					break;
				}
			}
			i=indexj;
			sa[index++]=s1;
		}
		
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]);
		}
		
	}

}
