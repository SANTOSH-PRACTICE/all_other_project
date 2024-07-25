package StringPractis;

import java.util.Iterator;

public class LengthOfsubarray 
{
public static void main(String[] args) {
	String s="ababcdac";
	int max=0;
	int start=0;
	int end=0;
	
	
	for (int i = 0; i <s.length(); i++)
	{
		int j = 0;
		int cnt=0;
		for (; j < s.length(); j++)
		{
			boolean flag=true;
			
			for (int k = i; k <j ; k++) 
			{
				if(s.charAt(j)==s.charAt(k))
				{
					flag=false;
					break;
					
				}
				
			}
			if(flag==false)
			{
				cnt++;
				break;
				
			}
		}
		if(cnt!=0)
		{
			int maxvar=j-i;
			if(maxvar>max)
			{
			    max=maxvar;
			    start=i;
			    end=j-1;
			    
			}
			
		}
			}
	System.out.println(max);
	
	for (int i = start; i <= end; i++)
	{
		System.out.print(s.charAt(i));
	}
	
	
}
}
