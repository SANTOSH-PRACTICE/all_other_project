package Day2281221c;

public class IndexFindOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adgdffgt";
		System.out.println("with using array");
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(i+" "+c[i]);
		}
/*********************************************/
		System.out.println("without using array");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)+" "+i);
		}
	}

}
