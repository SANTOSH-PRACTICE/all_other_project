package Day43091221practis;

public class LexigrapyCompaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdgfg";
		String s2="bcd";
		System.out.println("method: "+s1.compareTo(s2));
		int i=0;
		int count=0;
		while(i<s1.length()&&i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
				count++;
				break;
				
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("process : "+(s1.length()-s2.length()));
		}

	}

}
