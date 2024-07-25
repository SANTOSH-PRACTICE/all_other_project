package Day4301221c;

public class LexigrapyCopare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";//change character and check o/p
		String s2="abcd";
		System.out.println("method : "+s1.compareTo(s2));
		int i=0;
		int cnt=0;
		while(i<s1.length()&&i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
				cnt++;
				break;
				
			}
			i++;
		}
		if(cnt==0)
		{
			System.out.println("process: "+(s1.length()-s2.length()));
		}

	}

}
