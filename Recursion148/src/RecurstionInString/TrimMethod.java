package RecurstionInString;

public class TrimMethod {

	public static void main(String[] args) {
      String s="     hello    ";
      char ch=' ';
      String s1="";
      s1=loopI(0,ch,s,s1);
     
      System.out.println(s1);
	}

	private static String loopI(int i, char ch, String s, String s1) {
		// TODO Auto-generated method stub
		if(i<s.length())
		{
			if(s.charAt(i)!=ch)
			{
				s1=s1+s.charAt(i);
			}
			i++;
			s1=loopI(i, ch, s, s1);
		}
		return s1;
	}

}
