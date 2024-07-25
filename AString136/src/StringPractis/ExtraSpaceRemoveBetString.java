package StringPractis;

public class ExtraSpaceRemoveBetString {

	public static void main(String[] args) {

		
		
		String s="Santosh      is     my     name";
		char ch=' ';
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)!=' '||s.charAt(i+1)!=' ')
			{
				System.out.print(s.charAt(i));
			}
			
		}
	}

}
