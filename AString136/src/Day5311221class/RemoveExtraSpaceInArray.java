package Day5311221class;

public class RemoveExtraSpaceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hasd    dfdd  hiiii    raffsf   hd";
		for (int i = 0; i < s.length(); i++) 
		{if(s.charAt(i)!=' '||s.charAt(i+1)!=' ')
		{
			System.out.print(s.charAt(i));
		}
		}
	}
}
