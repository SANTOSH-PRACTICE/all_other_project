package Day1271221;

public class BasicString8case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="";
		String s2="welcome";
		String s3="WELCOME";
		
		System.out.println(s2.equalsIgnoreCase(s3));//ture
		System.out.println(s1.isEmpty());//ture
		System.out.println(s2.isEmpty());//false
		
		System.out.println(s2.toUpperCase());//WELCOME
		System.out.println(s3.toLowerCase());//welcome

		
				

	}

}
