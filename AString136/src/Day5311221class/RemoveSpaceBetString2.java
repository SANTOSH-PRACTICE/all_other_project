package Day5311221class;

import java.util.Arrays;

public class RemoveSpaceBetString2 {//split implimentation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String s="  Welcome to hefshine abc    ";
    int cnt=0;
    s=s.trim();
    for (int i = 0; i < s.length(); i++)
    {
    	if(s.charAt(i)==' ')
    	{
    		cnt++;
    	}
    }
	
    int index=0;
    System.out.println(cnt);
    String sa[]=new String[cnt+1];
    for (int i = 0; i < s.length(); i++)
    {
    	String s1="";
    	int indexj=0;
    	
    	for (int j = i; j < s.length(); j++)
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
    System.out.println(Arrays.deepToString(sa));
	}

}
