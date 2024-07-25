package RecurstionInString;

public class replaceMethod {

	public static void main(String[] args) {
       String s="hellommmmaa";
       char ch[]=s.toCharArray();
       char c='m';
       loopI(0,ch,c);
       
      
       String s2=new String(ch);
       System.out.println(ch);
	}

	private static void loopI(int i, char[] ch, char c) {
		if(i<ch.length)
		{
			 if(ch[i]==c)
	    	   {
	    		   ch[i]='*';
	    	   }
			i++;
			loopI(i, ch, c);
		}
	}

}
