package RecurstionInString;

public class DoublicateCount {

	public static void main(String[] args) {
     String s="aabbcccc";
     loopOuterI(0,s);
    
	}

	private static void loopOuterI(int i, String s) {
      if(i<s.length())	
      {
    	  int count=0;
    	 count= loopInnerJ(i,0,s,count);
  		
  		if(count==0)
  		{
  			int count1=0;
  			count1=loopJ(i,0,count1,s);
  			
  		if(count1>0)
  		{
  			System.out.println(s.charAt(i)+" "+count1);
  		}
  		}
    	  i++;
    	  loopOuterI(i, s);
      }
	}

	private static int loopJ(int i, int j, int count1, String s) {
		if(j<s.length())
		{
			if(s.charAt(i)==s.charAt(j))
				{
					count1++;
				}
			j++;
			count1=loopJ(i, j, count1, s);
		}
		return count1;
		
	}

	private static int loopInnerJ(int i, int j, String s, int count) {
         if(j<i)
         {
        	 if(s.charAt(i)==s.charAt(j))
   			{
   				count++;
   			}
        	 j++;
        	count= loopInnerJ(i, j, s, count);
         }
		return count;
	}

}
