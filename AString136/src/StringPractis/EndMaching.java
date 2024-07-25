	package StringPractis;

public class EndMaching {

	public static void main(String[] args) {

		String s="santosh";
		String s1="sh";
		
		int i=s.length()-1;
		int count=0;
		for (int j = s1.length()-1; j>=0; j--) 
		{
			if(s.charAt(i)==s1.charAt(j))
			{
				count++;
				System.out.println(s.charAt(i)+" "+s1.charAt(j));
				
			}
			i--;


		}
		if(count==s1.length())
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
	}

}
