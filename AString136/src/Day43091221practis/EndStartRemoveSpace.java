package Day43091221practis;

public class EndStartRemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     santosh honrao   ";
        System.out.println(s.trim());
       int start=0;
       int end=s.length()-1;
       while(true)
       {
    	   if(s.charAt(start)!=' ')
    	   
    	   break;
          start++;
       }
       while(true)
       {
    	   if(s.charAt(end)!=' ')
    		   break;
    	   end--;
    	   
       }
       for (int i = start; i <= end; i++)
       {
		char ch= s.charAt(i);
		System.out.print(ch);
	 }
       
	}

}