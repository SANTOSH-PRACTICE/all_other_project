package StringPractis;

public class DublicateElementRemove {

	
	//1)dublicate element remove .   2)frequency count.  3)maximum minimun frequency
	public static void main(String[] args) {

		String s="aaabbbccgggggggiiioi";
		String s1="";
		
		char maxvar=0;
		char minvar=0;
		int max=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) 
		{
			int cnt=0;
			for (int j = 0; j <i; j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					
				}
				
					//System.out.println(cnt);
			}
			if(cnt==0)
			{
				int pcnt=0;
				for (int j = i; j < s.length(); j++) 
				{
					if(s.charAt(i)==s.charAt(j))
					{
						pcnt++;
						
					}
					
				}
			
			if(pcnt>0)
			{
				System.out.println(s.charAt(i)+" "+pcnt);
			}
			if(pcnt>max)
			{
				max=pcnt;
				maxvar=s.charAt(i);
			}
			if(pcnt<min)
			{
			min=pcnt;	
			minvar=s.charAt(i);
			}
		}}
		System.out.println("maximum frequency"+" "+  minvar+" "+min);
		System.out.println("minimum frequency"+" "+   maxvar+" "+max);
		
		for (int i = 0; i < s.length(); i++) 
		{
			int count =0;
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					
				}
				
				
			}
			if(count==0)
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
