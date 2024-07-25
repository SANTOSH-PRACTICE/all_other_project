package StringPractis;

public class ReveseAllString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="santosh shivgonda honrao";
		String sa[]=s.split(" ");
		
		
		for (int i = 0; i < sa.length; i++) 
		{
			String str=sa[i];
			char ch []=str.toCharArray();
			int start=0;
			int last=ch.length-1;
			while(start<last)
			{
				char temp=ch[start];
				ch[start]=ch[last];
				ch[last]=temp;
				start++;
				last--;
			}
			String s1=new String(ch);
			sa[i]=s1;
			
			}
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);

		}
		
	
	}

}
