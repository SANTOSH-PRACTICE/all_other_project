package Day1271221practis;

public class SequencingCharBk6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("SANTOSH");
		String s2=new String("santosh");
		String s3=new String("SANTOSH");
		String s4="SANTOSH";
		String s5="santosh";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//ture
		System.out.println(s1.equals(s4));//ture
		System.out.println(s1.equals(s5));//fakse
		System.out.println(s2.equals(s5));//ture
		System.out.println(s4.equals(s5));//false

	}

}
