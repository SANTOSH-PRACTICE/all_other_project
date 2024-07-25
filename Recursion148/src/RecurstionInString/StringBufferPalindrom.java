package RecurstionInString;

public class StringBufferPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		StringBuffer sb[]= {new  StringBuffer("naman"),
				              new  StringBuffer("ab"),
				              new  StringBuffer("abc")
				
	                        	};
		int count=0;
		for (int i = 0; i < sb.length; i++)
		{
			  StringBuffer s=new  StringBuffer("");
			  for (int j = sb[i].length()-1; j >=0; j--) 
			  {
				char c=sb[i].charAt(i);
				s=s.append(c);
			}
			  if(sb.toString().equals(s.toString()))
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
		}
		System.out.println("count"+count);
	}

}
