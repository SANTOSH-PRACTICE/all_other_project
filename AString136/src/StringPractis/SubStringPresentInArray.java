package StringPractis;

public class SubStringPresentInArray {

	public static void main(String[] args) {

		
		String s="abcd";
		String s1="bcd";
		int count=0;
		System.out.println("method: "+ s.indexOf(s1));
		
		
		for (int i = 0; i < s.length(); i++) 
		{
			int k=0;

			if(s.charAt(i)==s1.charAt(0))
			
			{
			for (int j = 0; j < s1.length(); j++) 
			{
				
				if(i+s1.length()<=s.length())
				{
					k++;
				}
				else
				{
					break;
				}
			}
			
		    }
			
		
			if(s1.length()==k)
			{
				System.out.println(i);
				count++;
				break;
			}
		}
			if(count==0)
			{
				System.out.println(-1);
			}
				
	}

}
