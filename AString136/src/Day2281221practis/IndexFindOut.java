package Day2281221practis;

public class IndexFindOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santosh";
		System.out.println("using array");
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(i+" "+c[i]);
			
		}
		System.out.println("without using array");
		for (int i = 0; i < s.length(); i++)
		{
			System.out.println(i+" "+s.charAt(i));
		}

	}

}
