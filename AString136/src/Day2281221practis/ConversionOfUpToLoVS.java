package Day2281221practis;

public class ConversionOfUpToLoVS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SANTOSH";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			if((ch>=65)&&(ch<=90))
			{
				ch=(char) (ch+32);
				s1=s1+ch;
			}
			else
			{
				ch=(char) (ch-32);
				s1=s1+ch;
				
			}
				
		}
System.out.println(s1);
	}

}