package prelim21feb2021setA;

public class Que5 {

	public static void main(String[] args) {

		
		String s="aaabbccddeeee";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			int count=0;
			for (int j = 0; j <i; j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
		//	System.out.println(s.charAt(i)+" "+count);

			if(count==0)
			{
				int cnt=0;
			for (int j = i+1; j <s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt<2)
			{
			for (int j = 0; j <s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					s1=s1+s.charAt(i);
				}
			}
			}
		}
	}
		System.out.println(s1);

	}
}
