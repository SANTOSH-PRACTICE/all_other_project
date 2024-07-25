package Day3291221practis;

public class EndMatchingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";
		String s2="def";
		System.out.println(s1.endsWith(s2));//method
		int count=0;
		
		int i=s1.length()-1;
		for (int j =s2.length()-1; j >=0; j--) 
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				count++;
				System.out.println(s1.charAt(i)+" "+s2.charAt(j));
				i--;
			}
			
		}
		if(count==s2.length())
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}

}
