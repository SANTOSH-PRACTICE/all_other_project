package Day3291221practis;

public class palidromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="nitin";//change name and check
		String s2="";
		for (int i = s1.length()-1; i >=0; i--) 
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		
		}
       System.out.println(s2);
       
       if(s1.equals(s2))
       {
    	   System.out.println("palidrom");
       }
       else
       {
    	   System.out.println("not palidrom");
       }
	}

}
