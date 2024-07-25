package StringPractis;

public class SpaceRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="     santosh     ";
		String s1="";
		char ch=' ';
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)!=ch)
			{
				s1=s1+s.charAt(i);
				
			}
			
		}
		System.out.println(s1);

	}

}
