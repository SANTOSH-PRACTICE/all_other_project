package Day5311221class;

public class LastIndexchecTwoString {
	public static void main(String[] args) {
			String s1="abcdabcda";
			String s2="cd";
			System.out.println(s1.lastIndexOf(s2));
			int cnt=0;
			for (int i = s1.length()-1; i >0 ; i--) 
			{
				if(s1.charAt(i)==s2.charAt(s2.length()-1))
				{
					int k=s2.length()-1;
					for (int j = i; j >i-s2.length(); j--) 
					{
						if(s1.charAt(j)==s2.charAt(k))
						{
							k--;
						}
						else
							break;
					}
					if(k==-1)
					{
						cnt++;
						System.out.println(i-(s2.length()-1));
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
