package Day4301221c;

public class FrequencyMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="absghgffghg";
		char minvar=0;
		char maxvar=0;
		int max=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < s1.length(); i++)
		{
			int count=0;
			for (int j =0; j <i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
				
			}if(count==0)
			{
			int pcnt=0;
			for (int j = 0; j <s1.length(); j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					pcnt++;
				}
			
			}
			if(pcnt>=0)
			{
				System.out.println(s1.charAt(i)+" "+pcnt);
			}
			if(max<pcnt)
			{
				max=pcnt;
				maxvar=s1.charAt(i);
			}
			if(min>pcnt)
			{
				min=pcnt;
				minvar=s1.charAt(i);
			}
		}}
		System.out.println("minimum frequency: "+minvar+" "+min);
		System.out.println("maximum frequency: "+maxvar+" "+max);
	}
}
