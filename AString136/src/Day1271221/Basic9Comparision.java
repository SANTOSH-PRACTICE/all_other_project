package Day1271221;

public class Basic9Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String  s1="Priya";
      String  s2="Priya";
      String s3=new String("Priya");
      System.out.println(s1==s2);//ture
      System.out.println(s1==s3);//false
      System.out.println(s1.compareTo(s3));//0
      
      String  s4="Qriya";//change name and compaire get checked//eg.qriyae
      String s5=new String("Priya");
      System.out.println(s4.compareTo(s5));//1
      
      System.out.println(s4.compareToIgnoreCase(s5));

      

	}

}
