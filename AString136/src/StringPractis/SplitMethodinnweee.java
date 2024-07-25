package StringPractis;

import java.util.Arrays;

public class SplitMethodinnweee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ooasshkjdjhajdhhdajdjdhajjjdhann";
		int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
				cnt++;
			}
		}
		String a[]=new String[cnt+1];
		int index=0;
		for (int i = 0; i <s.length(); i++)
		{
			
			int ij=0;
			String s1="";
			for (int j = i; j < s.length(); j++) 
			{
				if(s.charAt(j)!='a')
				{
					s1=s1+s.charAt(j);
					ij=j;
				}
				else
				{
					break;
				}
			}
			a[index++]=s1;
			i=ij+1;
			
		}
		System.out.println(Arrays.toString(a));

	}

}
