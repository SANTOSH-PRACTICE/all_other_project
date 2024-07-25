package Day5311221class;

import java.util.Arrays;

public class DicstionaryBookLet29tukaram 
{
	int compareTo(String s1,String s2)
	{
		for (int i = 0; i < s1.length(); i++)
		{
			for (int j = 0; j < s2.length(); j++) 
			{
				if(s1.charAt(i)!=s2.charAt(j))
				{
				return(s1.charAt(i)-s2.charAt(j));
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DicstionaryBookLet29tukaram a=new DicstionaryBookLet29tukaram();
		String []s= {"i","an","to","two","am","going","to","colleage"};
		
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++)
			{
				if(a.compareTo(s[j],s[i])<0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));

	}

}
