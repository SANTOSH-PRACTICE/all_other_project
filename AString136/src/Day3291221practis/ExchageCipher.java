package Day3291221practis;

public class ExchageCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdXYZ";
		String s2="";
		
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if((ch>=97)&&(ch<=122))
			{
				ch=(char) (ch-32);
				s2=s2+ch;
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);
		String s3="";
		for (int i = 0; i < s2.length(); i++)
		{
			int p=s2.charAt(i);
			if(p>='A'&&p<='Z')
			{
				p = (155-p);
				char newch=(char)p;
				s3=s3+newch;
				
			}
		}
		System.out.println(s3);
		

	}

}
