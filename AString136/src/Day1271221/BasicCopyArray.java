package Day1271221;

public class BasicCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char c[]= {'j','a','v','a'};
      String s1=new String(c);
      System.out.println(s1);
      
      String s2=String.copyValueOf(c);
      System.out.println(s2);
      String s3= String.copyValueOf(c, 1, 3);
      System.out.println(s3);
      


	
	}

}
