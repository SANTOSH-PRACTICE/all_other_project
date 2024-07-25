package Day43091221practis;

import java.util.Arrays;

public class dublicatecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbbbacccagggde";
		char ch[]=s.toCharArray();
		char ch1 []=new char[s.length()];
		String s1=" ";
		int index=0;
		
		for (int i = 0; i < ch.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					break;
				}
			}
			int cnt=0;
			for (int j = i-1; j >=0; j--)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					break;
				}
			}
			if(count>0 && cnt==0)
			{
				ch1[index++]=ch[i];
				s1=s1+ch[i];
			}
			
		}
		System.out.println("array method");
	for(char x:ch1)
	{
		System.out.print(x+" ");		
	}
	System.out.println();
	System.out.println("string method");
		System.out.println(s1);
	//	System.out.println(Arrays.toString(ch1));
		
		for (int i = 0; i < s.length(); i++)
		{
			int count1=0;
			for (int j =0; j <i; j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count1++;
				}
				
			}if(count1==0)
			{
			int pcnt=0;
			for (int j = 0; j <s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					pcnt++;
				}
			
			}
			if(pcnt>1)
			{
				System.out.println(s.charAt(i)+" "+pcnt);
			}
	}

}
}}