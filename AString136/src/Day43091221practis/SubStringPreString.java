package Day43091221practis;

public class SubStringPreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="cde";
		System.out.println("method: "+s1.indexOf(s2));
		int cnt=0;
		
		for (int i = 0; i < s1.length(); i++)
		{
			int k=0;
			if(i+s2.length()<=s1.length())
			{
			for (int j = i; j <i+s2.length(); j++) 
			{
				if(s1.charAt(j)==s2.charAt(k))
				{
					k++;
				}
				else
					break;
				
			}}
			if(s2.length()==k)
			{
				System.out.println(i);
				cnt++;
				break;
			}
			
			
		}
		if(cnt==0)
		{
			System.out.println(-1);
		}

	}

}
