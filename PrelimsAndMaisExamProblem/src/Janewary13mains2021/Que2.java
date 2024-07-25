package Janewary13mains2021;

import java.util.Arrays;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to hefshine";
		
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				cnt++;
				
			}
		}
		System.out.println(cnt);
		
		String s2[]=new String[cnt+1];
		int index=0;
		
		for (int i = 0; i < s.length(); i++)
		{
			String sa=" ";
			int j = i;
			for (; j < s.length(); j++) 
			{
				if(s.charAt(j)!=' ')
				{
					sa=sa+s.charAt(j);
					
				}
				else
					break;
			}
			//System.out.println(sa);
			i=j;
			s2[index++]=sa;
			
		}
		System.out.println(Arrays.deepToString(s2));
		

	}

}
