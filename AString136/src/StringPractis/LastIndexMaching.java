package StringPractis;

public class LastIndexMaching {

	public static void main(String[] args) {

		
		String s="abqcdabdddacdggh";
		String s1="cd";
		int cnt=0;

		for (int i = s.length()-1; i >0 ; i--) 
		{
			if(s.charAt(i)==s1.charAt(s1.length()-1))
			{
				int k=s1.length()-1;
				for (int j = i; j > i-s1.length(); j--)
				{
					if(s.charAt(j)==s1.charAt(k))
					{
						k--;
					}
					else
						break;
					
				}
				if(k==-1)
				{
					cnt++;
					System.out.println(i-(s1.length()-1));
					break;
				}
			}
			

			
		}
		if(cnt==0)
		{
			System.out.println(-1);
		}
	}

}
