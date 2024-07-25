package RecurstionInString;

public class LoweUppeerCase {

	public static void main(String[] args) {

		String s="heLLOpa";
		String s1=" ";
		s1=loopI(0,s1,s);
		
		System.out.println(s1);
	}

	private static String loopI(int i, String s1, String s) {
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
        	s1= loopI(i, s1, s);
         }
		return s1;
	}

}
