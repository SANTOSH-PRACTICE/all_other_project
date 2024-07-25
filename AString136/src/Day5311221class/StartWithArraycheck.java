package Day5311221class;

public class StartWithArraycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="abcd";//change char and check o/p
		System.out.println(s1.startsWith(s2));
		if(s1.length()>=s2.length())
		{
			int i=0;
			int cnt=0;
			while(i<s2.length())
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					i++;
				}
				else
				{cnt++;
				break;
					
				}
			}
			if(cnt==0)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
			
		}
		else
		{
			System.out.println(false);
		}

	}

}
