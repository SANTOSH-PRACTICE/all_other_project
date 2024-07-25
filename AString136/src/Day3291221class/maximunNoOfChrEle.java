package Day3291221class;

public class maximunNoOfChrEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abacac";//change number of charactor eg"aabbbdsddsffdf"like and check o/p
		int max=0;
		char var=0;
		char varmin=0;int min=Integer.MAX_VALUE;
		for (int i = 0; i < s1.length(); i++)
		{int count=0;
		for(int j=0;j<i;j++)    //(int j=i+1;j<s1.length();j++
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				count++;
			}
		}
		if(count==0)
		{
			int pcnt=0;
			for (int j = 0; j < s1.length(); j++) 
			{
				if(s1.charAt(i)==s1.charAt(j))
				{pcnt++;
				}
			}
		if(pcnt>=0)
		{
			System.out.println(s1.charAt(i)+" "+pcnt);
		}
		if(max<pcnt)
		{
			max=pcnt;
			var=s1.charAt(i);
		}
		if(min>pcnt)
		{
			min=pcnt;
			varmin=s1.charAt(i);
		}
		}
		}
		if(max==min)
		{
			System.out.println("equal");
		}
		else {
		System.out.println(var+" is occuring "+max+" times ");
		System.out.println(varmin+" is occuring "+min+" times ");
		}	
}}
