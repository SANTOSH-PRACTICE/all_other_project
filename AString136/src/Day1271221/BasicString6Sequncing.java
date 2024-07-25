package Day1271221;

public class BasicString6Sequncing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("welcome");
		String s2=new String("WELCOME");
		String s3=new String("welcome");
		String s4="WELCOME";
		String s5="WELCOME";

		String s6="welcome";
		
       System.out.println(s1.equals(s2));//false
       System.out.println(s1.equals(s3));//ture

       System.out.println(s4.equals(s5));//ture

       System.out.println(s4.equals(s6));//false

       System.out.println(s1.equals(s6));//ture
       System.out.println(s2.equals(s6));//false

	}

}
