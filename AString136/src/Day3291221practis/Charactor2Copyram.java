package Day3291221practis;

public class Charactor2Copyram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";
		String s2="";
		for (int i = 0; i < s1.length(); i++)
		{  char ch=s1.charAt(i);
		      s2=s2+ch+ch;
		}
		System.out.println(s2);

	}

}
