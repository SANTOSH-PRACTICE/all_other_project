package Day3291221class;

public class ChangePosionBk31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdXYZ";//abcdXYZ//abcde
		String s2=s1.toUpperCase();
		
		String s3="";
		System.out.println(s2);
		for (int i = 0; i < s2.length(); i++)
		{
			int p=s2.charAt(i);
			if(p>='A'&&p<='Z')
			{
				p=155-p;
				char newch=(char)p;
				s3=s3+newch;
			}
		}
		System.out.println(s3);
	}

}
