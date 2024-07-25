package RecurstionInString;

public class palimdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb[]= {new  StringBuffer("naman"),
				              new  StringBuffer("ab"),
				              new  StringBuffer("aba")
				
	                        	};
		int count=0;
		
		count=loopI(0,sb,count);
		
		System.out.println("count: "+count);

	}

	private static int loopI(int i, StringBuffer[] sb, int count) {
		// TODO Auto-generated method stub
		if(i<sb.length)
		{
			 StringBuffer s=new  StringBuffer("");
			s= LoopJ(i,sb[i].length()-1,s,sb);
			 
			 
			  if(sb[i].toString().equals(s.toString()))
			  {
				  System.out.println(sb[i]+" "+s);
				  System.out.println("---> is pelimdrom");
				  count++;
			  }
			  else
			  {
				  System.out.println(sb[i]+" "+s);
				  System.out.println("---> not pelimdrom");
			  }
			i++;
			count=loopI(i, sb, count);
		}
		return count;
	}

	private static StringBuffer LoopJ(int i, int j, StringBuffer s, StringBuffer[] sb) {
		
		if(j>=0)
		{
			 char c=sb[i].charAt(j);
				s=s.append(c);
			j--;
			s=LoopJ(i, j, s, sb);
		}
		return s;
		
	}

}
