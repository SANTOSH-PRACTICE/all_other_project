package StringPractis;

public class Lexigraphy {

	public static void main(String[] args) 
	{

		String s="abcd";
		String s1="abcnd";
		System.out.println("method"+ s.compareTo(s1));
		int count=0;
		int i=0;
		while(i<s.length()&&i<s1.length())
		{
		if(s.charAt(i)!=s1.charAt(i))
		{
			System.out.println(s.charAt(i)-s1.charAt(i));
			count++;
			break;
		}
		i++;
	   }
		if(count==0)
		{
			System.out.println(s.length()-s1.length());
		}
	}

}
