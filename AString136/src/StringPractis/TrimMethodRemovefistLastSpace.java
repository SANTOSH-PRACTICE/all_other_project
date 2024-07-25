package StringPractis;

public class TrimMethodRemovefistLastSpace {

	public static void main(String[] args) {

		
		String s="     Santosh     honrao     ";
		char ch=' ';
		String s1="";
		
		int start=0;
		int last=s.length()-1;
			while(true)
			{
				if(s.charAt(start)!=ch)	
				{
					break;
				}
				start++;
			}
			
			while(true)
			{
				if(s.charAt(last)!=ch)
					break;
				last--;
			}
			
			for (int i = start; i <= last; i++) 
			{
				char ch1=s.charAt(i);
				s1=s1+ch1;
			}
			System.out.println(s1);
			
		
	}

}
