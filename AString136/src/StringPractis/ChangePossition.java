package StringPractis;

public class ChangePossition {

	public static void main(String[] args) {
		
		
		String s="ABCDxyz";
		String s2=s.toUpperCase();
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			int p=s2.charAt(i);
			if(p>='A'&&p<='Z')
			{
				p=155-p;
				char q=(char) p;
				s1=s1+q;
			}
		}
		System.out.println(s1);
	}

}
