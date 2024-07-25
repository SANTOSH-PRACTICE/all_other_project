package RecurstionInString;

public class RevesePuzzle {

	public static void main(String[] args) {
      String s="abcdxyz";
      String s1="";
      
     s1= loopI(0,s,s1);
   
      System.out.println(s1);
      
      String s2="";
      s2=loopPrint(0,s1,s2);
     
      System.out.println(s2);
	}

	private static String loopPrint(int i, String s1, String s2) {
		if(i<s1.length())
		{
			int p=s1.charAt(i);
			if(p>='A'&&p<='Z')
			{
				p=155-p;
				char q= (char) p;
				s2=s2+q;
			}
			i++;
			s2=loopPrint(i, s1, s2);
		}
		return s2;
	}

	private static String loopI(int i, String s, String s1) {
      if(i<s.length())	
      {
    	  char ch=s.charAt(i);
			if(s.charAt(i)>='a'&&  s.charAt(i)<='z')
			{
				ch=(char)(ch-32);
				s1=s1+ch;
			}
			else
			{
				ch=(char)(ch+32);
				s1=s1+ch;
			}
    	  i++;
    	 s1= loopI(i, s, s1);
      }
	return s1;
	}

}
