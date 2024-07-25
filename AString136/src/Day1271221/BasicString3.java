package Day1271221;

public class BasicString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1=new String("Teena");
         String s=s1.intern();
         String s2="Teena";
         System.out.println(s==s2);
         System.out.println(s1+" "+s);


	}

}
