package StringPractis;

import java.util.Arrays;

public class SplitMethoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santosh  shivgonda honrao";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		String a[]=new String[cnt+1];
		int index=0;
		for (int i = 0; i < s.length(); i++)
		{
			int in=0;
			String s1="";
			for (int j = i; j < s.length(); j++)
			{
				if(s.charAt(j)!=' ')
				{
					s1=s1+s.charAt(j);
					in=j;
				}
				else
				{
					break;
				}
			}
			a[index++]=s1;
			i=in+1;
		}
		System.out.println(Arrays.toString(a));

	}

}
