package Day4301221c;

public class ReverseALLsTringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to hefshine";
		String sa []=s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
		String str =sa[i];
		char[] ch=str.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end)
		{
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			
		}
		String s1=new String(ch);
		sa[i]=s1;
		
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}

	}

}