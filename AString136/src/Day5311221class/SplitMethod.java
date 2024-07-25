package Day5311221class;

import java.util.Iterator;

public class SplitMethod {

	public static void main(String[] args) {

		
		String s2= "xadssddgdfdfsfgikjhjukjgjuyujh";
		int count=0;
		for (int i = 0; i < s2.length(); i++) 
		{
			if(s2.charAt(i)=='g')
			{
				count++;
			}
		}
		String[]sa=new String[++count];
		String s3="";
		int index=0;
		for (int i = 0; i < s2.length(); i++) 
		{
			char ch=s2.charAt(i);
			
			if(ch=='g')
			{
				sa[index++]=s2;
				s2="";
			}
			else
			{
				s3=s3+ch;
				if(i==s2.length()-1)
				{
					sa[index++]=s3;
				}
			}
		}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.print(sa[i]);
		}
		
	}

}
