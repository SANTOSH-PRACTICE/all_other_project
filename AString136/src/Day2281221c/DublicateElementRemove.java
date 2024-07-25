package Day2281221c;

public class DublicateElementRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdddgghhhffdd";
		String s1="";
		for (int i = 0; i<s.length(); i++)
		{
			int cnt=0;
			char ch=s.charAt(i);
			for (int j = i+1; j < s.length(); j++)
			{
			if(s.charAt(i)==s.charAt(j))
			{
				cnt++;
				break;
				
			}
			}
			if(cnt==0)
			{
				s1=s1+ch;
				
			}
		}
			System.out.println(s1);
		
	}

}
