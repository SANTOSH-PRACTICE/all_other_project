package StringPractis;

public class SubString {

	public static void main(String[] args) {

		
		String s="abcde";
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i; j <s.length(); j++) 
			{
				for (int k = i; k<= j; k++) 
				{
					System.out.print(s.charAt(k));
					
				}
				System.out.println();

			}
			
		}

	}

}
