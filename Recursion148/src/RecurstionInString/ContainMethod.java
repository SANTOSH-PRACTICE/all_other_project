package RecurstionInString;

public class ContainMethod {

	public static void main(String[] args) {
     String s="Hello";
     char ch='m';
     boolean flag=false;
    flag= loopI(0,ch,flag,s);
     for (int i = 0; i < s.length(); i++)
     {
		
	 }
     if(flag==false)
     {
    	 System.out.println(false);
     }
     else
     {
    	 System.out.println(true);
     }
	}

	private static boolean loopI(int i, char ch, boolean flag, String s) {
      if(i<s.length())	
      {
    	  if(s.charAt(i)==ch)
  		{
  			flag=true;
  			return flag;
  		}
    	  i++;
    	flag=  loopI(i, ch, flag, s);
      }
	return flag;
	}

}
