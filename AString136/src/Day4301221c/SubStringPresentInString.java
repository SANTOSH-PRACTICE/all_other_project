package Day4301221c;

public class SubStringPresentInString {

	public static void main(String[] args) {//booklet no 6
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="cd";// change string and check ans
		System.out.println("method: "+s1.indexOf(s2));
		
		int cnt=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==s2.charAt(0))
				
			{int k=0;
			if(i+s2.length()<=s1.length())
			{
			for (int j = i; j < i+s2.length(); j++)
			{
				if(s1.charAt(j)==s2.charAt(k))
				{
					k++;
				}
				else
				{
					break;
				}
			}}
			if(s2.length()==k)
			{
				System.out.println(i);
				cnt++;
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
