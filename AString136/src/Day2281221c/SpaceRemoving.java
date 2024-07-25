package Day2281221c;

public class SpaceRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Welcome     ";
		char ch=' ';
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=ch)
			{
				s1=s1+s.charAt(i);
				System.out.println(i+" "+s1);
				
			}
		}
		
             System.out.println(s1);
	}

}
