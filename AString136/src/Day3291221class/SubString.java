package Day3291221class;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";       // longest search remaing
		for (int i = 0; i <s1.length(); i++)
		{
			for (int j = i; j <s1.length(); j++)
			{  
				for (int k = i; k <=j; k++) 
				{
					System.out.print(s1.charAt(k));
				}
				System.out.println();
			}
		}

	}

}
