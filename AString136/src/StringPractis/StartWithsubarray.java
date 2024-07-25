package StringPractis;

public class StartWithsubarray {

	public static void main(String[] args) {

		String s="abcd";
		String s1="abcd";
		
		System.out.println(s1.startsWith(s1));
		if(s.length()<s1.length())
		{
			System.out.println(false);
		}
		else
		{
		int count=0;

		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < s1.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			
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

}
