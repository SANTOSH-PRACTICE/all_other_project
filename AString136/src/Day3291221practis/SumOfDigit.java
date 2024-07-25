package Day3291221practis;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="12345rtyui787";
		int sum=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			char x='0';
			char ch=s1.charAt(i);
			if(ch>=48&&ch<=57)
			{
				sum=sum+ch-x;
			}
		}
		System.out.println(sum);

	}

}
