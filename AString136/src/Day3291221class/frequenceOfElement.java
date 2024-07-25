package Day3291221class;

import java.util.Iterator;

public class frequenceOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";//change number of charactor eg"aabbbdsddsffdf"like and check o/p
		for (int i = 0; i < s1.length(); i++)
		{int count=0;
		for(int j=0;j<i;j++)
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
		}
	}}
	}


