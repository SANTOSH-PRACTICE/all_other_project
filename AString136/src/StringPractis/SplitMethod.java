package StringPractis;

import java.util.Iterator;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santosh honrao  my name";
		String a[]=new String[5];
		int index=0;
		for (int i = 0; i < s.length(); i++)
		{ 
			int cnt=0;
			String s1="";
			if(s.charAt(i)!=' ')
			{
				cnt++;
				break;
						
			}
			
			if(cnt>0)
			{
				for (int j = 0; j <= cnt; j++) 
				{
					s1=s1+s.charAt(j);
				}
				
				a[index++]=s1;

			}
	}
		for (int k = 0; k < a.length; k++) 
		{
			System.out.print(a[k]);
		}

	}

}
