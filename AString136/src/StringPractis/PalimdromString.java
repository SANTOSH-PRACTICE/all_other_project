package StringPractis;

public class PalimdromString {

	public static void main(String[] args) {

		
		String s="nitin";
		String s1="";
		for (int i = s.length()-1; i>=0; i--) 
		{
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==s1.charAt(i))
			{
				count++;
			}
		
	}
		if(count==s1.length())
		{
			System.out.println("pelimdrom");
		}
		else
		{
			System.out.println("not pelimdrom");
		}
			}

}
