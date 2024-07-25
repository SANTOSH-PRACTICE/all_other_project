package Day1271221;

public class BasicString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1=new String("Teena");
         String s=s1.intern();
         System.out.println(s1==s);
         System.out.println(s1+" "+s);

	}

}
